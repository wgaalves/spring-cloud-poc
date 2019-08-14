db.createUser(
    {
        user: "heimdall",
        pwd: "heimdall",
        roles:[
            {
                role: "readWrite",
                db:   "heimdall"
            }
        ]
    }
);