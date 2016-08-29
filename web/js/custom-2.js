window.Dropzone;
Dropzone.autoDiscover = false;

dropzoneOptions = {
    acceptedFiles: "image/*",
    url: 'GalleryServ',
    dictDefaultMessage: 'Drag or click here to upload'
};
var uploader = document.querySelector('#mydropzone');
var newDropzone = new Dropzone(uploader, dropzoneOptions);
newDropzone.on("success", function(file, filename) {
//    addGalleryContent(filename,sessionStorage.getItem("searchParameter")); 
});
newDropzone.on('thumbnail', function(file) {
      if ( file.width < 640 || file.height < 480 ) {
        file.rejectDimensions();
         alert('The image must be at least 640 x 480px');
      }
      else {
        file.acceptDimensions();
      }
    });