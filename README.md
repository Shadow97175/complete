XMLtoYAML

Демонстрация работы

Пример запроса

{"<note>\n
	
<to>Tove</to>\n

<from>Jani</from>\n

<heading>Reminder</heading>\n

<body>Don't forget me this weekend!</body>\n

</note>"}

Пример ответа

	note
	
	to: Tove
	
	from: Jani
	
  	heading: Reminder
	
  	body: Don't forget me this weekend!

Как запустить сервер

Загрузите исходные файлы через git

git clone https://github.com/Shadow97175/complete

git clone https://github.com/Shadow97175/requester

Поменяйте рабочий каталог на complete

cd complete

Сгенерируйте образ для Docker через Gradle

./gradlew createImage

Запустите сервер с помощью команды:

docker run -p 9000:9000 xml2yaml

Подождите несколько минут пока загрузятся необходимые библиотеки и запустится сервер

Далее запускается проект requester

Для остановки работы контейнера необходимо ввести команду

docker container stop "номер id контейнера"

Проверить рапотоспособность сервера можно через утилиту curl:

curl -d @test.xml http://localhost:9000/xml-to-yaml
