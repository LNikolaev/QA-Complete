rmdir result /S /Q
mkdir result
call "C:\Program Files\SmartBear\SoapUI-5.2.1\bin\testrunner.bat" -r -a -j -J REST-Project-soapui-project.xml -fresult -PAppID=80uc90wdkq8a5l34 -PHost=api.everlive.com -PApiKey=LxzZJJAgUFZAnZIeAhQ3OWR94edOrYV6
call junit-viewer --results=result\TEST-CRUD_Workflow.xml --save=result\TEST-CRUD_Workflow.html