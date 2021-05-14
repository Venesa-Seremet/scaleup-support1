(function($) {
    "use strict";
    var mainApp = {

            main_fun: function() {
                /*====================================
                 CUSTOM LINKS SCROLLING FUNCTION 
                ======================================*/

                $('a[href*=#]').click(function() {
                    if (location.pathname.replace(/^\//, '') == this.pathname.replace(/^\//, '') &&
                        location.hostname == this.hostname) {
                        var $target = $(this.hash);
                        $target = $target.length && $target ||
                            $('[name=' + this.hash.slice(1) + ']');
                        if ($target.length) {
                            var targetOffset = $target.offset().top;
                            $('html,body')
                                .animate({ scrollTop: targetOffset }, 800); //set scroll speed here
                            return false;
                        }
                    }
                });
                /*====================================
                VAGAS SLIDESHOW SCRIPTS
                ======================================*/
                $(function() {
                    $.vegas('slideshow', {
                        backgrounds: [
                            { src: 'assets/img/1.jpg', fade: 1000, delay: 7000 }, //CHANGE THESE IMAGE WITH YOUR ORIGINAL IMAGES
                            //THESE IMAGES ARE FOR DEMO PURPOSE ONLY YOU, CAN NOT USE THEM WITHOUT AUTHORS PERMISSION
                            { src: 'assets/img/5.jpg', fade: 1000, delay: 7000 },
                            { src: 'assets/img/6.jpg', fade: 1000, delay: 7000 }


                        ]
                    })('overlay', {
                        /** SLIDESHOW OVERLAY IMAGE **/
                        src: 'assets/plugins/vegas/overlays/14.png' // THERE ARE TOTAL 01 TO 15 .png IMAGES AT THE PATH GIVEN, WHICH YOU CAN USE HERE
                    });

                });





            },

            initialization: function() {
                mainApp.main_fun();

            }

        }
        // Initializing ///

    $(document).ready(function() {
        mainApp.main_fun();
    });

}(jQuery));