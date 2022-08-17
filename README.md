# imos-thredds

This is a POC, do not use it in production. 

When you imported this project, you need to mark the generated-sources folder
as generated source, in Intellj (right click folder --> Marked as --> generated source)

## Build

Create a maven run config with the following phase

clean install war:war

## Run

Create a run config with the following info

New a Tomcat 8 config, must use Tomcat 8. Then add the below parameters

VM options:
-Dtds.content.root.path=/tmp 
-Daws.accessKeyId=YOUR AWS ACCESS ID 
-Daws.secretAccessKey=YOUR AWS ACCESS KEY

URL : http://localhost:8080/thredds_0_0_0/

## Internal logic

Maven download the war, then unpack it locally. Add the log4j resources and extra classes to 
then unpack directory.

Then classes contains a bootstrap AodnBootstrap with is an entry point for 
other component scan (web.xml only scan thredds package). Then the Config
boot up other bean and connect to s3, scan through the directory structure
and then create the needed catalog.xml and its sub catalog.xml

## What is missing???

1. Proper test case
2. Stackman / Docker setup, should be light because no extra config needed.
3. Upstream query testing
4. Migration strategy (Use a different URL??)
5. Clean up the hardcode value.
6. Potential bug in output xml file name crash, use UUID or append random string