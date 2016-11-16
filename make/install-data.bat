rd yt-maintenance-data-jar /S /Q
md yt-maintenance-data-jar
pushd yt-maintenance-data-jar
md bin
md lib
md config

copy ..\..\..\thirdparty\dubbo\*.* bin\
copy ..\..\..\thirdparty\log4j\*.* bin\
copy ..\..\..\thirdparty\mybatis\*.* bin\
copy ..\..\..\thirdparty\sqlserver\*.* bin\
copy ..\..\..\thirdparty\spring\*.* bin\
copy ..\..\..\thirdparty\ssm\*.* bin\

copy ..\..\library\yt-information-data.jar lib\

copy ..\..\..\yt-platform\framework\lib\1.1\yt-data.jar bin\
copy ..\..\..\yt-platform\framework\lib\1.1\yt-db.jar bin\
copy ..\..\..\yt-platform\framework\lib\1.1\yt-utility.jar bin\

copy ..\..\yt-information-data\config\*.* config\
copy ..\startup-data.bat startup.bat
popd