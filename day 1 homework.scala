// Databricks notebook source
val data=sc.textFile("/FileStore/tables/airports-1.text")
data.collect()


// COMMAND ----------

// DBTITLE 1,Altitude is even and timstamp is:-"Pacific/Port_Moresby"
val newrdd=data.filter(line=>{
  line.split(",")(8).toInt % 2==0 && line.split(",")(11)=="\"Pacific/Port_Moresby\""
})
newrdd.take(10)
