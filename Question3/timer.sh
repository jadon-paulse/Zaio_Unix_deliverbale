#!/bin/bash
 TIMEFORMAT=%R

# java Main.java

# time = java Main.java

# time= time java Main.java
time=$(time (java Main.java >/dev/null 2>&1) 2>&1)
# now=$(time java Main.java)
echo "Execute time: "$time

# echo "Execute time : $time"

# echo $time