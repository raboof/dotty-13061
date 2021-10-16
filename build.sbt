//NOK:
//scalaVersion := "3.0.2-RC1-bin-20210712-47c949b-NIGHTLY"
//scalaVersion := "3.1.1-RC1-bin-20211007-c041327-NIGHTLY"
scalaVersion := "3.1.1-RC1-bin-20211013-3b5ff7a-NIGHTLY"

//OK:
//scalaVersion := "2.13.6"

Compile / scalacOptions := Seq("-release", "8")
Compile / doc / scalacOptions := Seq("-release", "11")
