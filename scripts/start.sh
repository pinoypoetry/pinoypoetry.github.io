#!/bin/bash

CONTEXT_PATH='ROOT'
# Remove Artifcats if available
if [[ -f $CATALINA_HOME/webapps/$CONTEXT_PATH.war ]]; then
    rm $CATALINA_HOME/webapps/$CONTEXT_PATH.war
fi
if [[ -d $CATALINA_HOME/webapps/$CONTEXT_PATH ]]; then
    rm -rfv $CATALINA_HOME/webapps/$CONTEXT_PATH
fi

cp /appl/pinoypoetry-1.0.0.war $CATALINA_HOME/webapps/$CONTEXT_PATH.war

service tomcat8 start