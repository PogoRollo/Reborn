# SpiritWorker
Эмулятор WIP-сервера для SoulWorker (GF 1.7.20.2). 
Основными разработчиками проекта Reborn на данный момент являются: 
* [sollosollo4](github.com/sollosollo4)
* [a8an7a](https://github.com/a8an7a)

# Запуск сервера и клиента

### Необходимо на ПК иметь
* Java 8 JDK
* Mongodb (recommended 4.0+)
* GF soulworker client (1.7.20.2) installed

### Запуск сервера
1. Скомпилируйте сервер с помощью консольной команды `./gradlew jar` в корневой папке проекта, либо же запустите файл compile.bat
2. Извлеките файлы .res из файла ресурсов data12.v в вашей папке клиента/данных SoulWorker в папку с названием resources в вашем корневом каталоге SpiritWorker (используйте что-то вроде https://github.com/Leayal/VData-Reader).
4. @PDB@?LoadBinaryVersion
5. Скопируйте папку `data` из папки исходников в корневую директорию вашего сервера.
6. Запустите сервер с помощью консольной команды `java -jar spiritworker.jar`, или же запустите файл server-start.bat, вы также можете запустить как auth, так и игровой сервер отдельно, добавив -auth или -game в качестве аргумента консольной команды
* java -jar spiritworker.jar -auth -> запустит только сервер аутентификации
* java -jar spiritworker.jar -game -> запустит только сервер игры

### Подключение от клиента
Запустите клиент с параметрами командной строки `SoulWorker.exe --authCode aaaaa --ip 127.0.0.1 --port 9000` as its launch arguments

### Игровые команды
`!give [item id] [кол-во]` - Выдаёт {количество} предмета с {id}
`!starterpack` - Выдаёт полный набло Vistor's armor и Tathata’s jewelry
`!changestat [stat id] [value]` - Высстанавливает определенному айди характеристики значение {value}
`!teleport [maze id]` - телепортирует игрока в другой город
*[10003] ROCCOTOWN
*[10021] CANDUSCITY
*[10031] FRACECITY
*[10041] RUINFORTRESS
*[10051] GRASSCOVERCAMP
*[10061] DIPLUCEHORIZON
*[11001] GOLDENCITADEL
`!gotopos [x] [y] [z]` - перемещает игрока в определенные координаты. Формат xyz - как в игре.
