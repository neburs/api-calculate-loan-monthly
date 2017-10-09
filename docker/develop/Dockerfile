FROM tomcat:8-jre8

# Deploy in root folder
RUN rm -rf /usr/local/tomcat/webapps/ROOT/
ADD quotecalc.war /usr/local/tomcat/webapps/ROOT.war

CMD ["catalina.sh", "run"]
