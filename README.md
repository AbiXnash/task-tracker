# task-tracker

An early start on a task tracker in Spring Boot 4 (Java 21, Lombok).

So far it has:

- `Tasks`: a task with `id`, `description`, `status`, `createdAt` and `updatedAt`
- `TaskStatus`: `TODO`, `INPROGRESS`, `DONE`
- `AddTaskHander.create(description)`: builds a new `TODO` task and logs it
- `IdGenerator`: a counter for task ids

Tasks aren't stored yet, and there's no command line or web interface. For a working Go version of the same idea,
see [go-task-tracker](https://github.com/AbiXnash/go-task-tracker).

## Build

```bash
./mvnw test
./mvnw spring-boot:run
```
