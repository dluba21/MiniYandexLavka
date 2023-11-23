CREATE TABLE COURIERS (
                          ID INTEGER PRIMARY KEY,
                          WEIGHT NUMERIC(2, 2),
                          DISTRICT VARCHAR(20),
                          START_PICK_TIME TIME,
                          END_PICK_TIME TIME
);