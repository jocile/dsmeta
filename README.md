<div align="center" id="top"> 

  ![Dsmeta Search container](https://user-images.githubusercontent.com/45495068/178110699-77ee8935-3a11-4daa-a0f0-906a4cc68a5b.png)

  &#xa0;

  <a href="https://dsmeta-jocile.netlify.app/">Demo</a>
</div>

<h1 align="center">Dsmeta</h1>

<p align="center">
  <img alt="Github top language" src="https://img.shields.io/github/languages/top/jocile/dsmeta?color=56BEB8">

  <img alt="Github language count" src="https://img.shields.io/github/languages/count/jocile/dsmeta?color=56BEB8">

  <img alt="Repository size" src="https://img.shields.io/github/repo-size/jocile/dsmeta?color=56BEB8">

  <img alt="License" src="https://img.shields.io/github/license/jocile/dsmeta?color=56BEB8">

  <!-- <img alt="Github issues" src="https://img.shields.io/github/issues/jocile/dsmeta?color=56BEB8" /> -->

  <!-- <img alt="Github forks" src="https://img.shields.io/github/forks/jocile/dsmeta?color=56BEB8" /> -->

  <!-- <img alt="Github stars" src="https://img.shields.io/github/stars/jocile/dsmeta?color=56BEB8" /> -->
</p>

<p align="center">
  <a href="#dart-about">About</a> &#xa0; | &#xa0; 
  <a href="#sparkles-features">Features</a> &#xa0; | &#xa0;
  <a href="#rocket-technologies">Technologies</a> &#xa0; | &#xa0;
  <a href="#white_check_mark-requirements">Requirements</a> &#xa0; | &#xa0;
  <a href="#checkered_flag-starting">Starting</a> &#xa0; | &#xa0;
  <a href="#memo-license">License</a> &#xa0; | &#xa0;
  <a href="https://github.com/jocile" target="_blank">Author</a> &#xa0; | &#xa0;
  <a href="#books-references">References</a>
</p>

<br>

## :dart: About ##

Dsmeta is a sales inquiry app where you can search for sales in a certain date range and notify best sellers via SMS. It uses the back-end with Java and Spring, and the front-end with React. This app was built in the Spring React week of the @devsuperior course.

## :sparkles: Features ##

:heavy_check_mark: REST API with Java and Spring Boot\
:heavy_check_mark: Database with ORM\
:heavy_check_mark: Front end with ReactJS\
:heavy_check_mark: Layers, components, best practices\
:heavy_check_mark: SMS integration\
:heavy_check_mark: Cloud deployment with CI/CD

## :rocket: Technologies ##

The following tools were used in this project:

- :heavy_check_mark: [Java JDK 17](https://docs.oracle.com/en/java/javase/17/);
  - :heavy_check_mark: [Lombok to generate class constructors, with getters and setters](https://projectlombok.org/);
  - :heavy_check_mark: [Maven builder](https://maven.apache.org/);
  - :heavy_check_mark: [Spring Boot framework](https://glysns.gitbook.io/springframework/);
    - :heavy_check_mark: [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#boot-features-jpa-and-spring-data);
- :heavy_check_mark: [H2 in-memory database](https://www.h2database.com/);
- :heavy_check_mark: [ReactJS user interfaces](https://pt-br.reactjs.org/);
  - :heavy_check_mark: [Yarn - package management](https://yarnpkg.com/);
  - :heavy_check_mark: [React Native](https://reactnative.dev/);
  - :heavy_check_mark: [TypeScript](https://www.typescriptlang.org/);
- :heavy_check_mark: [Netlify web app server](https://www.netlify.com/);
- :heavy_check_mark: [Heroku - plataform as a service](https://www.heroku.com/);

## :white_check_mark: Requirements ##

Before starting :checkered_flag:, you need to have installed:

* [Git](https://git-scm.com)
* [Java JDK 17](https://docs.oracle.com/en/java/javase/17/) 
* [Maven builder](https://maven.apache.org/)
* [Heroku CLI](https://devcenter.heroku.com/articles/heroku-cli)
* [NodeJS 16.x](https://nodejs.org/en/download/)
* [Yarn - package management](https://yarnpkg.com/);

> See [installations guide](https://github.com/devsuperior/sds-dsmeta/tree/main/_instalacao)

## :checkered_flag: Starting ##

* Clone this project\
`git clone https://github.com/jocile/dsmeta`

### Access Front-end

1 Access the terminal\
`cd dsmeta/frontend`

2 Install dependencies\
`yarn`

3 Run the project front-end\
`yarn dev`

> The local frontend server will initialize in the browser:\
> :link: <http://localhost:3000>

### Access Back-end

1 Access the terminal\
`cd catalog/backend`

2 Run the project backend\
`./mvnw spring-boot:run`

> and in-memory H2 database will be initialized in:\
> :link: <http://localhost:8080/h2-console>\
> The backend API can be accessed at:\
> :link: <http://localhost:8080/sales/>\
> The end point filter by minimum date and maximum date:\
> :link: <http://localhost:8080/sales?minDate=2021-02-02&maxDate=2022-04-04>

### The cloud ap:

> The cloud frontend server will initialize in the browser:\
> :link: <https://dsmeta-jocile.netlify.app/>

> The cloud backend API with the following end point filter: by minimum date and maximum date:\
> :link: <https://dsmeta-jocile.herokuapp.com/sales?minDate=2021-02-02&maxDate=2022-04-04>


## :memo: License ##

This project is under license from MIT. For more details, see the [LICENSE](LICENSE) file.


Made with :heart: by <a href="https://github.com/jocile" target="_blank">Jocile</a>

## :books: References

:link: [@devsuperior event Github](https://github.com/devsuperior/sds-dsmeta) | [Page](https://devsuperior.com.br/evento-sds) |
[Discord](https://discord.gg/Gj4yyp5Kcn) |
[Instagram](https://instagram.com/devsuperior.ig) \
:art: [Figma frontend](https://www.figma.com/file/PehiT8Dw4Lv5ioTSULZeRI/DSMeta3) \
:film_projector: [Postman](https://youtu.be/CWKLVapcnCU) \
:film_projector: [Heroku CLI](https://youtu.be/70LUh5KNaEk) \
:film_projector: [Devsuperior course lessons](https://www.youtube.com/c/DevSuperior)\
:link: [See the dsmeta wiki](https://github.com/jocile/dsmeta/wiki/)

&#xa0;

<a href="#top">Back to top</a>
