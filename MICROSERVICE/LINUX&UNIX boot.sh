#!/bin/sh

#modfpoint
DIR=/dir/dir2
SERVICE=("mc1" "mc2" "mc3")
JAVA_OPT="-Xms2048m -Xmx2048m -XX:PermSize=256m -XX:MaxPermSize=512m"

for SERVICE_NAME in "${SERVICE[@]}"; do

	PATH_TO_JAR=${DIR}/${SERVICE_NAME}.war
	PID=`ps fax|grep java|grep "${PATH_TO_JAR}"|awk '{print $1}'`

	case $1 in

	    start)
		if [ -n "${PID}" ]; then
		    echo "$SERVICE_NAME is already running";
		else		    
		    nohup java -jar $JAVA_OPT $PATH_TO_JAR 1> /dev/null 2>&1 &
		    echo "$SERVICE_NAME started ..."
		fi
	    ;;

	    stop)
		if [ -n "${PID}" ]; then
		    kill -9 ${PID}
		    echo "$SERVICE_NAME is exit (pid: ${PID})";
		else		    
		    echo "$SERVICE_NAME is not running ..."
		fi
	    ;;

	esac

done