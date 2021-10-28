[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]

# Java Sanitizer

Library that implements a ``` javax.validation``` abstraction and has its own custom ``` javax.validation.Constraint```
to simplify an API requests integrity validation.

## Installation

Using the maven dependency plugin add the next block to the module **pom.xml**:

#### Maven dependency

```xml
<dependency>
    <groupId>pt.fcmartins</groupId>
    <artifactId>sanitizer</artifactId>
    <version>0.000.001</version>
    <scope>provided</scope>
</dependency>
```

#### Wildfly module

* Directory : **\modules\pt\fcmartins\sanitizer\main**
* Module configuration:

    ```xml
  <?xml version="1.0" encoding="UTF-8"?>
    <module xmlns="urn:jboss:module:1.1" name="pt.fcmartins.sanitizer">
        <resources>
            <resource-root path="sanitizer-{version}.jar" />
        </resources>
        <dependencies>
            <module name="javaee.api" />
        </dependencies>
  </module>
    ```
  
## Authors

* [Francisco Martins](mailto:francisco.drive.7@gmail.com?subject=Java Sanitizer)

## License

Distributed under the MIT License. See `LICENSE` for more information.

[forks-url]: https://github.com/0xfcmartins/jsanitize/network/members
[stars-url]: https://github.com/0xfcmartins/jsanitize/stargazers
[issues-url]: https://github.com/0xfcmartins/jsanitize/issues
[license-url]: https://github.com/0xfcmartins/jsanitize/blob/master/LICENSE.txt
[issues-shield]: https://img.shields.io/github/issues/0xfcmartins/jsanitize.svg?style=for-the-badge
[forks-shield]: https://img.shields.io/github/forks/0xfcmartins/jsanitize.svg?style=for-the-badge
[stars-shield]: https://img.shields.io/github/stars/0xfcmartins/jsanitize.svg?style=for-the-badge
[license-shield]: https://img.shields.io/github/license/0xfcmartins/jsanitize.svg?style=for-the-badge
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[contributors-shield]: https://img.shields.io/github/contributors/0xfcmartins/jsanitize.svg?style=for-the-badge

