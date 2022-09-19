<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="col-xl-4 col-lg-4 col-md-6 col-sm-12">
    <div class="sidebar-wrapper">
        <!--Start single sidebar-->
        <div class="single-sidebar">
            <form class="search-form" action="Post" method="post">
                <input oninput="searchPosts(this)" name="postTitle" placeholder="Search" type="text">
                <button type="submit"><i class="fa fa-search" aria-hidden="true"></i></button>
            </form>
        </div>
        <!--End single sidebar-->
        <!--Start single sidebar-->
        <div class="single-sidebar">
            <div class="sidebar-title">
                <h3>Categories</h3>
            </div>
            <ul class="categories clearfix">
                <c:forEach var="x" items="${daoPost.categoryPost}">
                    <li><a href="Post?categoryId=${x.id}">${x.name} </a></li>
                    </c:forEach>       
            </ul>
        </div>
        <!--End single sidebar-->
        <!--Start single sidebar--> 
        <div class="single-sidebar">
            <div class="sidebar-title">
                <h3>Recent Post</h3>
            </div>
            <ul class="recent-post">
                <c:forEach var="x" items="${daoPost.posts}">
                    <li>
                        <div class="img-holder">
                            <img src="${x.thumbnailLink}" alt="Awesome Image">
                            <div class="overlay-style-one">
                                <div class="box">
                                    <div class="content">
                                        <a href="PostDetail?index=${x.id}"><i class="fa fa-link" aria-hidden="true"></i></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="title-holder">
                            <p><span class="icon-date"></span>${x.datePublic2}</p>
                            <h5 class="post-title"><a href="PostDetail?index=${x.id}">${x.title}</h5>
                            <a class="readmore" href="PostDetail?index=${x.id}">Continue Reading...</a>
                        </div>
                    </li>
                </c:forEach>



            </ul>
        </div>

    </div>    
</div>
<!--End Sidebar Wrapper-->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script>

    function searchPosts(para) {
        var textSearch = para.value;

        $.ajax({
            url: "/ChildrenCare/SearchPostByTittle",
            type: 'get',
            data: {
                txt: textSearch
            },
            success: function (response) {
                console.log(response);
//                var row = document.getElementById("content");
//                row.innerHTML = response;
                response.forEach(item => {
                    $("#content").html("<div class=\"single-blog-post col-xl-6 col-lg-6 col-md-12 col-sm-12\" style=\"justify-content: space-around;margin-bottom: 0; \"   >                                        \n"
                            + "                                        <div class=\"img-holder\"style=\"width: 100%; height: 200px;  \">\n"
                            + "                                            <img src=\"" + item['thumbnailLink'] + "\" alt=\"Awesome Image\">\n"
                            + "                                            <div class=\"categorie-button\">\n"
                            + "                                                <a class=\"btn-one\" href=\"#\">" + item['category']['name'] + "</a>    \n"
                            + "                                            </div>\n"
                            + "                                        </div>\n"
                            + "                                        <div class=\"text-holder\"style=\"width: 100%; height: 400px;\">\n"
                            + "                                            <div class=\"meta-box\">\n"
                            + "                                                <div class=\"author-thumb\">\n"
                            + "                                                    <img src=\"./images/blog/author-2.png\" alt=\"Image\">\n"
                            + "                                                </div>\n"
                            + "                                                <ul class=\"meta-info\">\n"
                            + "                                                    <li><a href=\"#\">" + item['Author'] + "</a></li>\n"
                            + "                                                    <li><a href=\"#\">" + item['UpdateDate'] + "</a></li>\n"
                            + "                                                </ul>    \n"
                            + "                                            </div>\n"
                            + "                                            <h3 class=\"blog-title\"><a href=\"PostDetail?index=" + item['id'] + "\">" + item['title'] + "</a></h3> \n"
                            + "                                            <div class=\"text-box\">\n"
                            + "                                                <p>" + item['content'] + "</p>\n"
                            + "                                            </div>\n"
                            + "                                            <div class=\"readmore-button\">\n"
                            + "                                                <a class=\"btn-two\" href=\"PostDetail?index=" + item['id'] + "\"><span class=\"flaticon-next\"></span>Continue Reading</a>\n"
                            + "                                            </div>  \n"
                            + "                                        </div>   \n"
                            + "                                    </div>");
                });


            },
            error: function (xhr) {
                console.log(xhr);

            }
        });
    }
</script>

