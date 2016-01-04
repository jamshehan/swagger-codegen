set executable=.\modules\swagger-codegen-cli\target\swagger-codegen-cli.jar

If Not Exist %executable% (
  mvn clean package
)

set JAVA_OPTS=%JAVA_OPTS% -XX:MaxPermSize=256M -Xmx1024M -DloggerPath=conf/log4j.properties
set ags=generate -t modules\swagger-codegen\src\main\resources\csharp -i https://ent-identitymanagementapi-dev/v1/swagger/v1 -l csharp -o Safelite.IdentityManagement.Generated -DpackageName=Safelite.IdentityManagement.Generated

java %JAVA_OPTS% -jar %executable% %ags%