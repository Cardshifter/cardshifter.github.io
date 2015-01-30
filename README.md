
cardshifter.github.io
=======

######_Updated 2015-30-01_

## Cardshifter Website

This repository is closely tied to the [Cardshifter](https://github.com/Cardshifter/Cardshifter) repository. Cardshifter is an open-source online Trading Card Game using Java 8 and related technologies.

The purpose of the website is to promote and inform about the project, and about its various modifications (mods). Please follow these guidelines if you wish to contribute.

### Contributing

If you wish to contribute, please take one of the following steps:

- Open a [Github Issue](https://github.com/Cardshifter/cardshifter.github.io/issues).
 
- Create a pull request.

- Contact [@Phrancis](https://github.com/Phrancis) or [@marcandregirard](https://github.com/marcandregirard) via Github.

- Join the [chatroom](http://chat.stackexchange.com/rooms/16134/tcg-creation) on Stack Exchange and discuss how you can contribute.

### Coding guidelines

**Important note:** If you wish to work directly on the project via branching or pull request, you will need a Java IDE as well as Maven and Tomcat server extensions. If you need help setting up please open an Issue and label it "Support Request", or join the [chatroom](http://chat.stackexchange.com/rooms/16134/tcg-creation) on Stack Exchange.

##### HTML

HTML source files must be located in the following [directory](https://github.com/Cardshifter/cardshifter.github.io/tree/master/io.web/src/main/webapp/WEB-INF):<br />

`cardshifter.github.io/io.web/src/main/webapp/WEB-INF`

- Do not use HTML properties, especially for formatting, unless absolutely necessary. Use CSS styles/classes instead.

- Use spaces, rather than tabs, for indentation. Two spaces for small indentation (e.g., between `<div>` sections) and four spaces for large indentation (e.g. between large sections).

- Use only one additional line break if you wish to delimit parts of the document.

- Use `page-template.html` to add new pages. That file will always be up-to-date with layout and page elements.

- Place images in the `images` folder, and in the appropriate sub-folder (e.g., `screenshots`, `logos`, etc.)

- Using hyphens `-` in file names, e.g., `this-file.html`. Do not use spaces or underscores.

##### CSS

CSS files must be located in the following [directory](https://github.com/Cardshifter/cardshifter.github.io/tree/web-content/io.web/src/main/webapp/css):<br />

`cardshifter.github.io/io.web/src/main/webapp/css`

- Use CSS 3 features as much as possible, for compatibility with future versions of major browsers.

- Keep site-wide changes into the `cardshifter.css` file. You can make CSS changes into the HTML if the change is to be applied only to that page, or temporarily for testing purposes.

- Prefix all classes in `cardshifter.css` with `csh-` so they can be more easily identified as a local CSS class, rather than a Bootstrap CSS class.

#### Images

Images to be displayed on the Cardshifter website should be saved into the `images/` folder and into the appropriate sub-folder (e.g., screenshots, logos). To link an image into an HTML file, simply use `<img src="images/logos/example.png" />`

- Use PNG format for non-photographic images.

- Use JPEG format for photographic images.

- Use SVG format for vectorial images. 

- Use CSS styles `<img src="foo.png" style="width: 100px; height: 100px" />` rather than HTML attributes `<img src="foo.png" height="100px" width="100px" />` to change image display properties.
