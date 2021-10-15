# Simple project with multi-modules gradle

Simple project contains multi module projects with gradle, this project save all modules configuration in `./build.gradle` ( can be delegated into all sub projects too ), all modules are declared in `/.settings.gradle`.



## Project's structure

```bash
.
├── build.gradle    # all configurations for all modules, projects and dependencies
├── settings.gradle # declaring modules
├── tasks.gradle    # extra gradle tasks
├── gradle.properties # settings to be used by gradle on tasks
|
|
├── deps            # all group of dependencies to be extend in all module
│   ├── core.gradle
│   ├── log.gradle
│   └── quality.gradle
|
|
├── project1        # module 1 depends on module 'util'
│   ├── resource
│   │   └── log4j2.properties
│   ├── src
│   │   └── com
│   │       └── test
│   │           └── project1
│   │               └── Application.java
│   └── test
│       └── com
│           └── test
│               └── project1
│                   └── ApplicationTest.java
|
|
└── util            # module 2 ( lib to be used on module 'project1')
    ├── src
    │   └── com
    │       └── test
    │           └── util
    │               └── UtilString.java
    └── test
        └── com
            └── test
                └── util
                    └── UtilStringTest.java

```

## How to create a new module?

  - Create a folder on root project with the same name as your module
  - all modules must contains the source settings with `src`,`test` or `resources` ( as `./build.gradle` is requiring for all modules )
  - include in `./settings.gradle` on `include('myproject')`
  - extended any dependencies group in `./build.gradle` eg. `def configDepsProject = [myproject : ["core","quality","other-group"]]`
  - you prefer setting extra informations add a new `./build.gradle` inside folder of new module or adding in root `./build.gradle`


## Some helpful commands
Command                           |  Description              | Comments
---                               |  ---                      | ---
`gradle clean`                    |  Clean builds in all modules      |
`gradle clean build`              |  Clean and build in all modules   |
`gradle build -x test`            |  Build skping task 'test' in all modules | `-x` is `--exclude-task` 
`gradle build --refresh-dependencies` | Build refreshing hardly in all modules |
`gradle test`                     |  Test all modules |
`gradle projects`                 |  List all modules |
`gradle :{name_module}:{task}`    |  Run any task in specific module | eg. `gradle :project1:clean test` or `gradle :project1:run`
`gradle jacocoTestReport`         |  Run jacoco task in all modules for test coveraging  |  will be availabled in `{folder_modules}/build/reports/jacoco/test/html/index.html`
`gradle sonarqube`                |  Run sonarqube task in all modules | required run container sonar up with `gradle sonar-up`


> Obs: In other to run tasks in specific  module try `gradle :{name_module}:{task}` eg. `gradle :project1:sonarqube`

