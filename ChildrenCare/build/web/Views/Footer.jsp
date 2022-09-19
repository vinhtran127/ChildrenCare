<footer class="footer-area" style="bottom:0px; width: 100%; ">
    <div class="container">
        <div class="row">
            <div class="col-xl-3 col-lg-6 col-md-6 col-sm-12">
                <div class="single-footer-widget marbtm50">
                    <div class="about-us">
                        <div class="footer-logo fix">
                            <a href="HoamePage">
                               <img src="./images/icon/logo.png" style="width: 105px; height: 100px;"  alt="Awesome Logo">
                            </a>
                        </div>  
                        <div class="text-box fix">
                            <p>Dento was started in the year 1995 as a small private clinic in VietNam. Looking for affordable children care?</p>
                            <p class="bottom-text">To take a trivial example, which of us ever undertakes laborious physical 
                            exercise, except to obtain.</p>
                        </div>
                        <div class="button fix">
                            <a class="btn-one" href="#">Read More</a>
                        </div>   
                    </div>
                </div>
            </div>
            <div class="col-xl-3 col-lg-6 col-md-6 col-sm-12">
                <div class="single-footer-widget martop6 marbtm50">
                    <div class="title">
                        <h3>Services</h3>
                    </div>
                    <ul class="specialities">
                        <c:forEach var="x" items="${daoService.categoryService}">
                            <li><a href="#">${x.name}</a></li>
                        </c:forEach>
                        
                    </ul>
                </div>
            </div>
            <div class="col-xl-3 col-lg-6 col-md-6 col-sm-12">
                <div class="single-footer-widget martop6 pdbtm50">
                    <div class="title">
                        <h3>Blogs</h3>
                    </div>
                    <ul class="facilities">
                         <c:forEach var="x" items="${daoPost.categoryPost}">
                            <li><a href="Post?categoryId=${x.id}">${x.name}</a></li>
                        </c:forEach>                      
                    </ul>
                </div>
            </div>
            <div class="col-xl-3 col-lg-6 col-md-6 col-sm-12">
                <div class="single-footer-widget martop6 pdtop-50">
                    <div class="title">
                        <h3>Opening Hours</h3>
                    </div>
                    <ul class="opening-hours">
                        <li>Monday <span class="float-right">8.30am -> 6.30pm</span></li>
                        <li>Tuesday <span class="float-right">10.00am -> 8.00pm</span></li>
                        <li>Wednesday <span class="float-right">8.30am -> 6.30pm</span></li>
                        <li>Thursday <span class="float-right">8.30am -> 7.00pm</span></li>
                        <li>Friday <span class="float-right">8.30am -> 3.00pm</span></li>
                        <li>Saturday <span class="float-right clr-green">Closed</span></li>
                        <li>Sunday <span class="float-right clr-green">Closed</span></li>
                    </ul>   
                </div>
            </div>           
        </div>
    </div>
</footer>   
</div>

<div class="scroll-to-top scroll-to-target thm-bg-clr" data-target="html"><span class="fa fa-angle-up"></span></div>

<!-- Color Palate / Color Switcher -->
<div class="color-palate">
    <div class="color-trigger">
        <i class="fa fa-gear"></i>
    </div>
    <div class="color-palate-head">
        <h6>Choose Your Color</h6>
    </div>
    <div class="various-color clearfix">
        <div class="colors-list">
            <span class="palate default-color active" data-theme-file="css/color-themes/default-theme.css"></span>
            <span class="palate teal-color" data-theme-file="css/color-themes/teal-theme.css"></span>
            <span class="palate navy-color" data-theme-file="css/color-themes/navy-theme.css"></span>
            <span class="palate yellow-color" data-theme-file="css/color-themes/yellow-theme.css"></span>
            <span class="palate blue-color" data-theme-file="css/color-themes/blue-theme.css"></span>
            <span class="palate purple-color" data-theme-file="css/color-themes/purple-theme.css"></span>
            <span class="palate olive-color" data-theme-file="css/color-themes/olive-theme.css"></span>
            <span class="palate red-color" data-theme-file="css/color-themes/red-theme.css"></span>
        </div>
    </div>
    <div class="palate-foo">
        <span>You can easily change and switch the colors.</span>
    </div>
</div>