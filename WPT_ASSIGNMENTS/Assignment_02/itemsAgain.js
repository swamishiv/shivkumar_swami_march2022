let express = require('express');
const res = require('express/lib/response');
const app = express();
const mysql = require('mysql2');


let dbparams =
{
    host: 'localhost',
    user: 'root',
    password: 'cdac',
    database: 'manage',
    port: 3306
};

const con = mysql.createConnection(dbparams);

app.use(express.static("staticfolder"));

app.get("/getalldetails", (req, resp) => {

    con.query('select * from itemagain', [],
        (error, rows) => {
            if (error) {
                console.log("Database in not connected");
            } else {

                resp.send(rows);
            }

        });

    // resp.send(output);
});

app.get("/getitemdetails", (req, resp) => {

    let itemno = req.query.itemno;
    let output = { status: false, details: {} }
    con.query('select itemname,itemprice from itemagain where itemno =?', [itemno], (error, rows) => {
        if (error) {
            console.log("Database in not connected");
        } else {
            if (rows.length > 0) {
                output.status = true;
                output.details = rows[0];

            }
            resp.send(output);
        }

    });

    // resp.send(output);
});

app.get("/additemdetails", (req, resp) => {

    let input = { itemno: req.query.itemno, itemname: req.query.itemname, itemprice: req.query.itemprice };
    let output = false;
    con.query('insert into itemagain (itemno,itemname,itemprice) values(?,?,?)', [input.itemno, input.itemname, input.itemprice], (error, rows) => {
        if (error) {
            console.log("Database in not connected");
        } else {
            console.log("Database in connected");
            output = true;
        }
        resp.send(output);
    });
});





app.listen(900, function () {
    console.log("server listening at port 900...")
});