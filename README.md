#cardshifter.github.io

######_Last revision: 2015-04-04_

## Cardshifter Website

This repository is closely tied to the [Cardshifter](https://github.com/Cardshifter/Cardshifter) repository. Cardshifter is an open-source online Trading Card Game (TCG) using Java 8 and related technologies.

The purpose of the website is to promote and inform about the project, and about its various modifications (mods). Please follow these guidelines if you wish to contribute.

### Contributing

If you wish to contribute, please take one of the following steps:

- Open a [Github Issue](https://github.com/Cardshifter/cardshifter.github.io/issues).
 
- Create a pull request.

- Contact [@Phrancis](https://github.com/Phrancis) or [@marcandregirard](https://github.com/marcandregirard) via Github.

- Join the [chatroom](http://chat.stackexchange.com/rooms/16134/tcg-creation) on Stack Exchange and discuss how you can contribute.

### Coding guidelines

The HTML and CSS source files are currently located in the following [sub-directory](https://github.com/Cardshifter/cardshifter.github.io/tree/master/io.web/src/main/webapp/WEB-INF):<br>
**/io.web/src/main/webapp/WEB-INF**

**Important note:** If you wish to work directly on the project via branching or pull request, you will need a Java IDE as well as Maven and Tomcat server extensions. If you need help setting up please open an Issue and label it "Support Request", or join the [chatroom](http://chat.stackexchange.com/rooms/16134/tcg-creation) on Stack Exchange.

##### HTML

- Do not use HTML properties, especially for formatting, unless absolutely necessary. Use CSS instead.

- Use spaces, rather than tabs, for indentation. Two spaces for small indentation (e.g., between `<div>` sections) and four spaces for large indentation (e.g. between large sections).

- Use only one additional line break if you wish to delimit parts of the document.

- Use `page-template.html` to add new pages. That file will always be up-to-date with layout and page elements.

- Place images in the `images` folder, and in the appropriate sub-folder (e.g., `screenshots`, `logos`, etc.)

- Sub-sites for mods should be isolated in their own folder, with same folder structure as the primary Cardshifter structure.

- Using hyphens `-` in file names. Do not use spaces or underscores.

##### CSS

- Use CSS 3 features as much as possible, for compatibility with future versions of major browsers.

- Keep site-wide changes into the `cardshifter.css` file. You can make CSS changes into the HTML if the change is to be applied only to that page, or temporarily for testing purposes.

- Prefix all classes in `cardshifter.css` with `csh-` so they can be more easily identified as a local CSS class, rather than a Bootstrap CSS class.

##Guidelines for images



Make sure to save images in the appropriate sub-folder. Do not save any images in the main `images/` folder. 

####Logos

- Folder: `images/logos/`

- Use for logos and similar branding images. 

- These will normally be PNG files, or SVG for vectorial images in some cases.

- Use descriptive naming. For example, use `Twitter_logo_blue.png` rather than `Twitter.png`.

####Screenshots

- Folder: `images/screenshots/`

- Use for game and other screenshots of the applications. 

- These will normally be PNG files, unless they contain significant photographic (rasterized) elements, in which case you may use JPG. Do not use SVG images for screenshots.

- Use versioned naming to represent which application version they come from. Be sure to update the `images.html` file in [WEB-INF](https://github.com/Cardshifter/cardshifter.github.io/tree/web-content/io.web/src/main/webapp/WEB-INF) so that the most current version is displayed on the site.

- Example naming for release 0.4: `0.4-deck-builder.png`

####Card pictures

- Folder: `images/card-pictures/`

- Use for images that are tied to playing cards in the Cardshifter game, to be displayed in a future card gallery.

- These will normally be SVG vector images, as they will be drawn and colored by artist contributors. If an image contains mostly photographic/rasterized content, use JPG instead. 

- Simply use the card name for naming purposes, e.g.: `heavy-mech.svg`

>>>>>>> web-content
