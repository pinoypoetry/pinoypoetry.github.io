#!/bin/bash
CONTEXT_PATH='ROOT'
# Remove Artifcats if available
if [[ -f /var/lib/tomcat8/webapps/$CONTEXT_PATH.war ]]; then
   sudo rm /var/lib/tomcat8/webapps/$CONTEXT_PATH.war
fi
if [[ -d /var/lib/tomcat8/webapps/$CONTEXT_PATH ]]; then
   sudo  rm -rfv /var/lib/tomcat8/webapps/$CONTEXT_PATH
fi
sudo cp /appl/pinoypoetry*.war /appl/ROOT.war
sudo cp /appl/ROOT.war /var/lib/tomcat8/webapps/

sudo service tomcat8 start