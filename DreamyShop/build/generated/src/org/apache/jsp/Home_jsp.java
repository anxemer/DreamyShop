package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html class=\"no-js\" lang=\"zxx\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\" />\n");
      out.write("    <title>ShopGrids - Bootstrap 5 eCommerce HTML Template.</title>\n");
      out.write("    <meta name=\"description\" content=\"\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/images/favicon.svg\" />\n");
      out.write("\n");
      out.write("    <!-- ========================= CSS here ========================= -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/LineIcons.3.0.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/tiny-slider.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/glightbox.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!--[if lte IE 9]>\n");
      out.write("      <p class=\"browserupgrade\">\n");
      out.write("        You are using an <strong>outdated</strong> browser. Please\n");
      out.write("        <a href=\"https://browsehappy.com/\">upgrade your browser</a> to improve\n");
      out.write("        your experience and security.\n");
      out.write("      </p>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("    <!-- Preloader -->\n");
      out.write("    <div class=\"preloader\">\n");
      out.write("        <div class=\"preloader-inner\">\n");
      out.write("            <div class=\"preloader-icon\">\n");
      out.write("                <span></span>\n");
      out.write("                <span></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- /End Preloader -->\n");
      out.write("\n");
      out.write("    <!-- Start Header Area -->\n");
      out.write("    <header class=\"header navbar-area\">\n");
      out.write("        <!-- Start Topbar -->\n");
      out.write("        <div class=\"topbar\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row align-items-center\">\n");
      out.write("                        <div class=\"col-lg-4 col-md-4 col-12\">\n");
      out.write("                           \n");
      out.write("                        </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-4 col-12\">\n");
      out.write("                        <div class=\"top-middle\">\n");
      out.write("                            <ul class=\"useful-links\">\n");
      out.write("                                <li><a href=\"home\">Home</a></li>\n");
      out.write("                                <li><a href=\"about-us.html\">About Us</a></li>\n");
      out.write("                                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-4 col-12\">\n");
      out.write("                        <div class=\"top-end\">\n");
      out.write("                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            <ul class=\"user-login\">\n");
      out.write("                                ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Topbar -->\n");
      out.write("        <!-- Start Header Middle -->\n");
      out.write("        <div class=\"header-middle\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row align-items-center\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-7\">\n");
      out.write("                        <!-- Start Header Logo -->\n");
      out.write("                        <a class=\"navbar-brand\" href=\"home\">\n");
      out.write("                            <h1 style=\"color: aliceblue; font-size: medium;\">Dreamy Shop</h1>\n");
      out.write("                        </a>\n");
      out.write("                        <!-- End Header Logo -->\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-5 col-md-7 d-xs-none\">\n");
      out.write("                        <!-- Start Main Menu Search -->\n");
      out.write("                        <form action=\"search\" method=\"post\">\n");
      out.write("                        <div class=\"main-menu-search\">\n");
      out.write("                            <!-- navbar search start -->\n");
      out.write("                            <div class=\"navbar-search search-style-5\">\n");
      out.write("                                \n");
      out.write("                                <div class=\"search-input\">\n");
      out.write("                                    <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${txtS}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txt\" type=\"text\" placeholder=\"Search\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"search-btn\">\n");
      out.write("                                    <button type=\"submit\"><i class=\"lni lni-search-alt\"></i></button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- navbar search Ends -->\n");
      out.write("                        </div>\n");
      out.write("                            </form>\n");
      out.write("                        <!-- End Main Menu Search -->\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-2 col-5\">\n");
      out.write("                        <div class=\"middle-right-area\">\n");
      out.write("                            <div class=\"nav-hotline\">\n");
      out.write("                                <i class=\"lni lni-phone\"></i>\n");
      out.write("                                <h3>Hotline:\n");
      out.write("                                    <span style=\"color: black;\">0333 044 220 </span>\n");
      out.write("                                </h3>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"navbar-cart\">\n");
      out.write("                                <div class=\"wishlist\">\n");
      out.write("                                    <a href=\"javascript:void(0)\">\n");
      out.write("                                        <i class=\"lni lni-heart\"></i>\n");
      out.write("                                        <span class=\"total-items\">0</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"cart-items\">\n");
      out.write("                                    <a href=\"javascript:void(0)\" class=\"main-btn\">\n");
      out.write("                                        <i class=\"lni lni-cart\"></i>\n");
      out.write("                                        <span class=\"total-items\">2</span>\n");
      out.write("                                    </a>\n");
      out.write("                                    <!-- Shopping Item -->\n");
      out.write("                                    <div class=\"shopping-item\">\n");
      out.write("                                        <div class=\"dropdown-cart-header\">\n");
      out.write("                                            <span>2 Items</span>\n");
      out.write("                                            <a href=\"cart.html\">View Cart</a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <ul class=\"shopping-list\">\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"javascript:void(0)\" class=\"remove\" title=\"Remove this item\"><i\n");
      out.write("                                                        class=\"lni lni-close\"></i></a>\n");
      out.write("                                                <div class=\"cart-img-head\">\n");
      out.write("                                                    <a class=\"cart-img\" href=\"product-details.html\"><img\n");
      out.write("                                                            src=\"assets/images/header/cart-items/item1.jpg\" alt=\"#\"></a>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"content\">\n");
      out.write("                                                    <h4><a href=\"product-details.html\">\n");
      out.write("                                                            Apple Watch Series 6</a></h4>\n");
      out.write("                                                    <p class=\"quantity\">1x - <span class=\"amount\">$99.00</span></p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"javascript:void(0)\" class=\"remove\" title=\"Remove this item\"><i\n");
      out.write("                                                        class=\"lni lni-close\"></i></a>\n");
      out.write("                                                <div class=\"cart-img-head\">\n");
      out.write("                                                    <a class=\"cart-img\" href=\"product-details.html\"><img\n");
      out.write("                                                            src=\"assets/images/header/cart-items/item2.jpg\" alt=\"#\"></a>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"content\">\n");
      out.write("                                                    <h4><a href=\"product-details.html\">Wi-Fi Smart Camera</a></h4>\n");
      out.write("                                                    <p class=\"quantity\">1x - <span class=\"amount\">$35.00</span></p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                        <div class=\"bottom\">\n");
      out.write("                                            <div class=\"total\">\n");
      out.write("                                                <span>Total</span>\n");
      out.write("                                                <span class=\"total-amount\">$134.00</span>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"button\">\n");
      out.write("                                                <a href=\"checkout.html\" class=\"btn animate\">Checkout</a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!--/ End Shopping Item -->\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Header Middle -->\n");
      out.write("        <!-- Start Header Bottom -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row align-items-center\">\n");
      out.write("                <div class=\"col-lg-8 col-md-6 col-12\">\n");
      out.write("                    <div class=\"nav-inner\">\n");
      out.write("                        <!-- Start Mega Category Menu -->\n");
      out.write("                        <div class=\"mega-category-menu\">\n");
      out.write("                            <span class=\"cat-button\"><i class=\"lni lni-menu\"></i>All Categories</span>\n");
      out.write("                            <ul class=\"sub-category\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write(">\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- End Mega Category Menu -->\n");
      out.write("                        <!-- Start Navbar -->\n");
      out.write("                        <nav class=\"navbar navbar-expand-lg\">\n");
      out.write("                            <button class=\"navbar-toggler mobile-menu-btn\" type=\"button\" data-bs-toggle=\"collapse\"\n");
      out.write("                                data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\"\n");
      out.write("                                aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                                <span class=\"toggler-icon\"></span>\n");
      out.write("                                <span class=\"toggler-icon\"></span>\n");
      out.write("                                <span class=\"toggler-icon\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <div class=\"collapse navbar-collapse sub-menu-bar\" id=\"navbarSupportedContent\">\n");
      out.write("                                                            </div> \n");
      out.write("                        </nav>\n");
      out.write("                        <!-- End Navbar -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-md-6 col-12\">\n");
      out.write("                    <!-- Start Nav Social -->\n");
      out.write("                    <div class=\"nav-social\">\n");
      out.write("                        <h5 class=\"title\">Follow Us:</h5>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"javascript:void(0)\"><i class=\"lni lni-facebook-filled\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"javascript:void(0)\"><i class=\"lni lni-twitter-original\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"javascript:void(0)\"><i class=\"lni lni-instagram\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"javascript:void(0)\"><i class=\"lni lni-skype\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Nav Social -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Header Bottom -->\n");
      out.write("    </header>\n");
      out.write("    <!-- End Header Area -->\n");
      out.write("\n");
      out.write("    <!-- Start Hero Area -->\n");
      out.write("    <section class=\"hero-area\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-8 col-12 custom-padding-right\">\n");
      out.write("                    <div class=\"slider-head\">\n");
      out.write("                        <!-- Start Hero Slider -->\n");
      out.write("                        \n");
      out.write("                        <div class=\"hero-slider\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                        <!-- End Hero Slider -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-12\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12 col-md-6 col-12 md-custom-padding\">\n");
      out.write("                            <!-- Start Small Banner -->\n");
      out.write("                            \n");
      out.write("                            <div class=\"hero-small-banner\"\n");
      out.write("                                 \n");
      out.write("                                style=\"background-image: url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${n.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(");\">\n");
      out.write("                                <div class=\"content\">\n");
      out.write("                                    \n");
      out.write("                                        <b>NEW GAME</b>\n");
      out.write("                                        <h1>\n");
      out.write("                                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${n.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                    </h1>\n");
      out.write("                                    <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${n.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" VND</h3>\n");
      out.write("                                </div>\n");
      out.write("                                 \n");
      out.write("                            </div>\n");
      out.write("                            <!-- End Small Banner -->\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-12 col-md-6 col-12\">\n");
      out.write("                            <!-- Start Small Banner -->\n");
      out.write("                            <div class=\"hero-small-banner style2\">\n");
      out.write("                                <div class=\"content\">\n");
      out.write("                                    <h2>Weekly Sale!</h2>\n");
      out.write("                                    <p>Saving up to 50% off all online store items this week.</p>\n");
      out.write("                                    <div class=\"button\">\n");
      out.write("                                        <a class=\"btn\" href=\"product-grids.html\">Shop Now</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Start Small Banner -->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- End Hero Area -->\n");
      out.write("\n");
      out.write("    <!-- Start Trending Product Area -->\n");
      out.write("    <section class=\"trending-product section\" >\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                \n");
      out.write("                <div class=\"col-12\">\n");
      out.write("                    <div class=\"section-title\">\n");
      out.write("                        <h2 style=\"color: #f189b1;\">Trending Product</h2>\n");
      out.write("                        <p>There are many variations of passages of Lorem Ipsum available, but the majority have\n");
      out.write("                            suffered alteration in some form.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("            <div class=\"row\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("            </div>\n");
      out.write("                               \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </section>\n");
      out.write("    <!-- End Trending Product Area -->\n");
      out.write("\n");
      out.write("    <!-- Start Call Action Area -->\n");
      out.write("    <!-- <section class=\"call-action section\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row \">\n");
      out.write("                <div class=\"col-lg-8 offset-lg-2 col-12\">\n");
      out.write("                    <div class=\"inner\">\n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            <h2 class=\"wow fadeInUp\" data-wow-delay=\".4s\">Currently You are using free<br>\n");
      out.write("                                Lite version of ShopGrids</h2>\n");
      out.write("                            <p class=\"wow fadeInUp\" data-wow-delay=\".6s\">Please, purchase full version of the template\n");
      out.write("                                to get all pages,<br> features and commercial license.</p>\n");
      out.write("                            <div class=\"button wow fadeInUp\" data-wow-delay=\".8s\">\n");
      out.write("                                <a href=\"javascript:void(0)\" class=\"btn\">Purchase Now</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section> -->\n");
      out.write("    <!-- End Call Action Area -->\n");
      out.write("\n");
      out.write("    <!-- Start Banner Area -->\n");
      out.write("    <section class=\"banner section\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6 col-md-6 col-12\">\n");
      out.write("                    <div class=\"single-banner\" style=\"background-image:url('assets/images/banner/banner-1-bg.jpg')\">\n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            <h2>Smart Watch 2.0</h2>\n");
      out.write("                            <p>Space Gray Aluminum Case with <br>Black/Volt Real Sport Band </p>\n");
      out.write("                            <div class=\"button\">\n");
      out.write("                                <a href=\"product-grids.html\" class=\"btn\">View Details</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6 col-md-6 col-12\">\n");
      out.write("                    <div class=\"single-banner custom-responsive-margin\"\n");
      out.write("                        style=\"background-image:url('assets/images/banner/banner-2-bg.jpg')\">\n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            <h2>Smart Headphone</h2>\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, <br>eiusmod tempor\n");
      out.write("                                incididunt ut labore.</p>\n");
      out.write("                            <div class=\"button\">\n");
      out.write("                                <a href=\"product-grids.html\" class=\"btn\">Shop Now</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- End Banner Area -->\n");
      out.write("\n");
      out.write("    <!-- Start Shipping Info -->\n");
      out.write("    <section class=\"shipping-info\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <ul>\n");
      out.write("                <!-- Free Shipping -->\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"media-icon\">\n");
      out.write("                        <i class=\"lni lni-delivery\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"media-body\">\n");
      out.write("                        <h5>Free Shipping</h5>\n");
      out.write("                        <span>On order over $99</span>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <!-- Money Return -->\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"media-icon\">\n");
      out.write("                        <i class=\"lni lni-support\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"media-body\">\n");
      out.write("                        <h5>24/7 Support.</h5>\n");
      out.write("                        <span>Live Chat Or Call.</span>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <!-- Support 24/7 -->\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"media-icon\">\n");
      out.write("                        <i class=\"lni lni-credit-cards\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"media-body\">\n");
      out.write("                        <h5>Online Payment.</h5>\n");
      out.write("                        <span>Secure Payment Services.</span>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <!-- Safe Payment -->\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"media-icon\">\n");
      out.write("                        <i class=\"lni lni-reload\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"media-body\">\n");
      out.write("                        <h5>Easy Return.</h5>\n");
      out.write("                        <span>Hassle Free Shopping.</span>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- End Shipping Info -->\n");
      out.write("\n");
      out.write("    <!-- Start Footer Area -->\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <!-- Start Footer Top -->\n");
      out.write("<!--        <div class=\"footer-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"inner-content\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-3 col-md-4 col-12\">\n");
      out.write("                            <div class=\"footer-logo\">\n");
      out.write("                                <a href=\"index.html\">\n");
      out.write("                                    <img src=\"assets/images/logo/white-logo.svg\" alt=\"#\">\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-9 col-md-8 col-12\">\n");
      out.write("                            <div class=\"footer-newsletter\">\n");
      out.write("                                <h4 class=\"title\">\n");
      out.write("                                    Subscribe to our Newsletter\n");
      out.write("                                    <span>Get all the latest information, Sales and Offers.</span>\n");
      out.write("                                </h4>\n");
      out.write("                                <div class=\"newsletter-form-head\">\n");
      out.write("                                    <form action=\"#\" method=\"get\" target=\"_blank\" class=\"newsletter-form\">\n");
      out.write("                                        <input name=\"EMAIL\" placeholder=\"Email address here...\" type=\"email\">\n");
      out.write("                                        <div class=\"button\">\n");
      out.write("                                            <button class=\"btn\">Subscribe<span class=\"dir-part\"></span></button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>-->\n");
      out.write("        <!-- End Footer Top -->\n");
      out.write("        <!-- Start Footer Middle -->\n");
      out.write("        <div class=\"footer-middle\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"bottom-inner\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-3 col-md-6 col-12\">\n");
      out.write("                            <!-- Single Widget -->\n");
      out.write("                            <div class=\"single-footer f-contact\">\n");
      out.write("                                <h3>Get In Touch With Us</h3>\n");
      out.write("                                <p class=\"phone\">Phone: +1 (900) 33 169 7720</p>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><span>Monday-Friday: </span> 9.00 am - 8.00 pm</li>\n");
      out.write("                                    <li><span>Saturday: </span> 10.00 am - 6.00 pm</li>\n");
      out.write("                                </ul>\n");
      out.write("                                <p class=\"mail\">\n");
      out.write("                                    <a href=\"mailto:support@shopgrids.com\">support@shopgrids.com</a>\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- End Single Widget -->\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-3 col-md-6 col-12\">\n");
      out.write("                            <!-- Single Widget -->\n");
      out.write("                            <div class=\"single-footer our-app\">\n");
      out.write("                                <h3>Our Mobile App</h3>\n");
      out.write("                                <ul class=\"app-btn\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"javascript:void(0)\">\n");
      out.write("                                            <i class=\"lni lni-apple\"></i>\n");
      out.write("                                            <span class=\"small-title\">Download on the</span>\n");
      out.write("                                            <span class=\"big-title\">App Store</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"javascript:void(0)\">\n");
      out.write("                                            <i class=\"lni lni-play-store\"></i>\n");
      out.write("                                            <span class=\"small-title\">Download on the</span>\n");
      out.write("                                            <span class=\"big-title\">Google Play</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- End Single Widget -->\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-3 col-md-6 col-12\">\n");
      out.write("                            <!-- Single Widget -->\n");
      out.write("                            <div class=\"single-footer f-link\">\n");
      out.write("                                <h3>Information</h3>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"javascript:void(0)\">About Us</a></li>\n");
      out.write("                                    <li><a href=\"javascript:void(0)\">Contact Us</a></li>\n");
      out.write("                                    <li><a href=\"javascript:void(0)\">Downloads</a></li>\n");
      out.write("                                    <li><a href=\"javascript:void(0)\">Sitemap</a></li>\n");
      out.write("                                    <li><a href=\"javascript:void(0)\">FAQs Page</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- End Single Widget -->\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-3 col-md-6 col-12\">\n");
      out.write("                            <!-- Single Widget -->\n");
      out.write("                            <div class=\"single-footer f-link\">\n");
      out.write("                                <h3>Shop Departments</h3>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"javascript:void(0)\">Computers & Accessories</a></li>\n");
      out.write("                                    <li><a href=\"javascript:void(0)\">Smartphones & Tablets</a></li>\n");
      out.write("                                    <li><a href=\"javascript:void(0)\">TV, Video & Audio</a></li>\n");
      out.write("                                    <li><a href=\"javascript:void(0)\">Cameras, Photo & Video</a></li>\n");
      out.write("                                    <li><a href=\"javascript:void(0)\">Headphones</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- End Single Widget -->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Footer Middle -->\n");
      out.write("        <!-- Start Footer Bottom -->\n");
      out.write("<!--        <div class=\"footer-bottom\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"inner-content\">\n");
      out.write("                    <div class=\"row align-items-center\">\n");
      out.write("                        <div class=\"col-lg-4 col-12\">\n");
      out.write("                            <div class=\"payment-gateway\">\n");
      out.write("                                <span>We Accept:</span>\n");
      out.write("                                <img src=\"assets/images/footer/credit-cards-footer.png\" alt=\"#\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-4 col-12\">\n");
      out.write("                            <div class=\"copyright\">\n");
      out.write("                                <p>Designed and Developed by<a href=\"https://graygrids.com/\" rel=\"nofollow\"\n");
      out.write("                                        target=\"_blank\">GrayGrids</a></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-4 col-12\">\n");
      out.write("                            <ul class=\"socila\">\n");
      out.write("                                <li>\n");
      out.write("                                    <span>Follow Us On:</span>\n");
      out.write("                                </li>\n");
      out.write("                                <li><a href=\"javascript:void(0)\"><i class=\"lni lni-facebook-filled\"></i></a></li>\n");
      out.write("                                <li><a href=\"javascript:void(0)\"><i class=\"lni lni-twitter-original\"></i></a></li>\n");
      out.write("                                <li><a href=\"javascript:void(0)\"><i class=\"lni lni-instagram\"></i></a></li>\n");
      out.write("                                <li><a href=\"javascript:void(0)\"><i class=\"lni lni-google\"></i></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>-->\n");
      out.write("        <!-- End Footer Bottom -->\n");
      out.write("    </footer>\n");
      out.write("    <!--/ End Footer Area -->\n");
      out.write("\n");
      out.write("    <!-- ========================= scroll-top ========================= -->\n");
      out.write("    <a href=\"#\" class=\"scroll-top\">\n");
      out.write("        <i class=\"lni lni-chevron-up\"></i>\n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("    <!-- ========================= JS here ========================= -->\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/tiny-slider.js\"></script>\n");
      out.write("    <script src=\"assets/js/glightbox.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/main.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        //========= Hero Slider \n");
      out.write("        tns({\n");
      out.write("            container: '.hero-slider',\n");
      out.write("            slideBy: 'page',\n");
      out.write("            autoplay: true,\n");
      out.write("            autoplayButtonOutput: false,\n");
      out.write("            mouseDrag: true,\n");
      out.write("            gutter: 0,\n");
      out.write("            items: 1,\n");
      out.write("            nav: false,\n");
      out.write("            controls: true,\n");
      out.write("            controlsText: ['<i class=\"lni lni-chevron-left\"></i>', '<i class=\"lni lni-chevron-right\"></i>'],\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        //======== Brand Slider\n");
      out.write("        tns({\n");
      out.write("            container: '.brands-logo-carousel',\n");
      out.write("            autoplay: true,\n");
      out.write("            autoplayButtonOutput: false,\n");
      out.write("            mouseDrag: true,\n");
      out.write("            gutter: 15,\n");
      out.write("            nav: false,\n");
      out.write("            controls: false,\n");
      out.write("            responsive: {\n");
      out.write("                0: {\n");
      out.write("                    items: 1,\n");
      out.write("                },\n");
      out.write("                540: {\n");
      out.write("                    items: 3,\n");
      out.write("                },\n");
      out.write("                768: {\n");
      out.write("                    items: 5,\n");
      out.write("                },\n");
      out.write("                992: {\n");
      out.write("                    items: 6,\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isAdmin == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li><a href=\"contact.html\">Manager Products</a></li>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <div class=\"user\">\n");
        out.write("                                <i class=\"lni lni-user\"></i>\n");
        out.write("                                Hello ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                            </div>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li>\n");
        out.write("                                    <a href=\"Login.jsp\">Sign In</a>\n");
        out.write("                                </li>\n");
        out.write("                                <li>\n");
        out.write("                                    <a href=\"Signup.jsp\">Register</a>\n");
        out.write("                                </li>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li>\n");
        out.write("                                    <a href=\"logout\">Log Out</a>\n");
        out.write("                                </li>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                \n");
          out.write("                                <li><a href=\"category?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Sale}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("s");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <!-- Start Single Slider -->\n");
          out.write("                            <div class=\"single-slider\"\n");
          out.write("                                style=\"background-image: url(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(");\">\n");
          out.write("                                <div class=\"content\">\n");
          out.write("                                    <strong>BIG SALE</strong>\n");
          out.write("                                    <h1>\n");
          out.write("                                       ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                    </h1>\n");
          out.write("<!--                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor\n");
          out.write("                                        incididunt ut labore et dolore magna aliqua.</p>-->\n");
          out.write("                                    <h3 style=\"color: #fff\"><b style=\"color: #f189b1\">Now Only: </b> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" VND</h3>\n");
          out.write("                                    <div class=\"button\">\n");
          out.write("                                        <a href=\"product-grids.html\" class=\"btn\">Detail</a>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                            <!-- End Single Slider -->\n");
          out.write("                            <!-- Start Single Slider -->\n");
          out.write("<!--                            <div class=\"single-slider\"\n");
          out.write("                                style=\"background-image: url(assets/images/hero/slider-bg2.jpg);\">\n");
          out.write("                                <div class=\"content\">\n");
          out.write("                                    <h2><span>Big Sale Offer</span>\n");
          out.write("                                        Get the Best Deal on CCTV Camera\n");
          out.write("                                    </h2>\n");
          out.write("                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor\n");
          out.write("                                        incididunt ut labore et dolore magna aliqua.</p>\n");
          out.write("                                    <h3><span>Combo Only:</span> $590.00</h3>\n");
          out.write("                                    <div class=\"button\">\n");
          out.write("                                        <a href=\"product-grids.html\" class=\"btn\">Shop Now</a>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>-->\n");
          out.write("                            <!-- End Single Slider -->\n");
          out.write("                             ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listG}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("o");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    \n");
          out.write("                <div class=\"col-lg-3 col-md-6 col-12\">\n");
          out.write("                    \n");
          out.write("                    <!-- Start Single Product -->\n");
          out.write("                    <div class=\"single-product\">\n");
          out.write("                        \n");
          out.write("                        <div class=\"product-image\">\n");
          out.write("                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"#\">\n");
          out.write("                            <div class=\"button\">\n");
          out.write("                                <a href=\"product-details.html\" class=\"btn\"><i class=\"lni lni-cart\"></i> Add to Cart</a>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"product-info\">\n");
          out.write("                            <span class=\"category\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.cname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                            <h4 class=\"title\">\n");
          out.write("                                <a href=\"product-grids.html\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                            </h4>\n");
          out.write("                            <ul class=\"review\">\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star\"></i></li>\n");
          out.write("                                <li><span>4.0 Review(s)</span></li>\n");
          out.write("                            </ul>\n");
          out.write("                            <div class=\"price\">\n");
          out.write("                                <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" VND</span>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                     <!--End Single Product--> \n");
          out.write("                                                        \n");
          out.write("\n");
          out.write("                </div>\n");
          out.write("<!--                <div class=\"col-lg-3 col-md-6 col-12\">\n");
          out.write("                     Start Single Product \n");
          out.write("                    <div class=\"single-product\">\n");
          out.write("                        <div class=\"product-image\">\n");
          out.write("                            <img src=\"assets/images/products/product-2.jpg\" alt=\"#\">\n");
          out.write("                            <span class=\"sale-tag\">-25%</span>\n");
          out.write("                            <div class=\"button\">\n");
          out.write("                                <a href=\"product-details.html\" class=\"btn\"><i class=\"lni lni-cart\"></i> Add to Cart</a>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"product-info\">\n");
          out.write("                            <span class=\"category\">Speaker</span>\n");
          out.write("                            <h4 class=\"title\">\n");
          out.write("                                <a href=\"product-grids.html\">Big Power Sound Speaker</a>\n");
          out.write("                            </h4>\n");
          out.write("                            <ul class=\"review\">\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><span>5.0 Review(s)</span></li>\n");
          out.write("                            </ul>\n");
          out.write("                            <div class=\"price\">\n");
          out.write("                                <span>$275.00</span>\n");
          out.write("                                <span class=\"discount-price\">$300.00</span>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                     End Single Product \n");
          out.write("                </div>\n");
          out.write("                <div class=\"col-lg-3 col-md-6 col-12\">\n");
          out.write("                     Start Single Product \n");
          out.write("                    <div class=\"single-product\">\n");
          out.write("                        <div class=\"product-image\">\n");
          out.write("                            <img src=\"assets/images/products/product-3.jpg\" alt=\"#\">\n");
          out.write("                            <div class=\"button\">\n");
          out.write("                                <a href=\"product-details.html\" class=\"btn\"><i class=\"lni lni-cart\"></i> Add to Cart</a>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"product-info\">\n");
          out.write("                            <span class=\"category\">Camera</span>\n");
          out.write("                            <h4 class=\"title\">\n");
          out.write("                                <a href=\"product-grids.html\">WiFi Security Camera</a>\n");
          out.write("                            </h4>\n");
          out.write("                            <ul class=\"review\">\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><span>5.0 Review(s)</span></li>\n");
          out.write("                            </ul>\n");
          out.write("                            <div class=\"price\">\n");
          out.write("                                <span>$399.00</span>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                     End Single Product \n");
          out.write("                </div>\n");
          out.write("                <div class=\"col-lg-3 col-md-6 col-12\">\n");
          out.write("                     Start Single Product \n");
          out.write("                    <div class=\"single-product\">\n");
          out.write("                        <div class=\"product-image\">\n");
          out.write("                            <img src=\"assets/images/products/product-4.jpg\" alt=\"#\">\n");
          out.write("                            <span class=\"new-tag\">New</span>\n");
          out.write("                            <div class=\"button\">\n");
          out.write("                                <a href=\"product-details.html\" class=\"btn\"><i class=\"lni lni-cart\"></i> Add to Cart</a>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"product-info\">\n");
          out.write("                            <span class=\"category\">Phones</span>\n");
          out.write("                            <h4 class=\"title\">\n");
          out.write("                                <a href=\"product-grids.html\">iphone 6x plus</a>\n");
          out.write("                            </h4>\n");
          out.write("                            <ul class=\"review\">\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><span>5.0 Review(s)</span></li>\n");
          out.write("                            </ul>\n");
          out.write("                            <div class=\"price\">\n");
          out.write("                                <span>$400.00</span>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                     End Single Product \n");
          out.write("                </div>\n");
          out.write("                <div class=\"col-lg-3 col-md-6 col-12\">\n");
          out.write("                     Start Single Product \n");
          out.write("                    <div class=\"single-product\">\n");
          out.write("                        <div class=\"product-image\">\n");
          out.write("                            <img src=\"assets/images/products/product-5.jpg\" alt=\"#\">\n");
          out.write("                            <div class=\"button\">\n");
          out.write("                                <a href=\"product-details.html\" class=\"btn\"><i class=\"lni lni-cart\"></i> Add to Cart</a>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"product-info\">\n");
          out.write("                            <span class=\"category\">Headphones</span>\n");
          out.write("                            <h4 class=\"title\">\n");
          out.write("                                <a href=\"product-grids.html\">Wireless Headphones</a>\n");
          out.write("                            </h4>\n");
          out.write("                            <ul class=\"review\">\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><span>5.0 Review(s)</span></li>\n");
          out.write("                            </ul>\n");
          out.write("                            <div class=\"price\">\n");
          out.write("                                <span>$350.00</span>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                     End Single Product \n");
          out.write("                </div>\n");
          out.write("                <div class=\"col-lg-3 col-md-6 col-12\">\n");
          out.write("                     Start Single Product \n");
          out.write("                    <div class=\"single-product\">\n");
          out.write("                        <div class=\"product-image\">\n");
          out.write("                            <img src=\"assets/images/products/product-6.jpg\" alt=\"#\">\n");
          out.write("                            <div class=\"button\">\n");
          out.write("                                <a href=\"product-details.html\" class=\"btn\"><i class=\"lni lni-cart\"></i> Add to Cart</a>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"product-info\">\n");
          out.write("                            <span class=\"category\">Speaker</span>\n");
          out.write("                            <h4 class=\"title\">\n");
          out.write("                                <a href=\"product-grids.html\">Mini Bluetooth Speaker</a>\n");
          out.write("                            </h4>\n");
          out.write("                            <ul class=\"review\">\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star\"></i></li>\n");
          out.write("                                <li><span>4.0 Review(s)</span></li>\n");
          out.write("                            </ul>\n");
          out.write("                            <div class=\"price\">\n");
          out.write("                                <span>$70.00</span>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                     End Single Product \n");
          out.write("                </div>\n");
          out.write("                <div class=\"col-lg-3 col-md-6 col-12\">\n");
          out.write("                     Start Single Product \n");
          out.write("                    <div class=\"single-product\">\n");
          out.write("                        <div class=\"product-image\">\n");
          out.write("                            <img src=\"assets/images/products/product-7.jpg\" alt=\"#\">\n");
          out.write("                            <span class=\"sale-tag\">-50%</span>\n");
          out.write("                            <div class=\"button\">\n");
          out.write("                                <a href=\"product-details.html\" class=\"btn\"><i class=\"lni lni-cart\"></i> Add to Cart</a>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"product-info\">\n");
          out.write("                            <span class=\"category\">Headphones</span>\n");
          out.write("                            <h4 class=\"title\">\n");
          out.write("                                <a href=\"product-grids.html\">PX7 Wireless Headphones</a>\n");
          out.write("                            </h4>\n");
          out.write("                            <ul class=\"review\">\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star\"></i></li>\n");
          out.write("                                <li><span>4.0 Review(s)</span></li>\n");
          out.write("                            </ul>\n");
          out.write("                            <div class=\"price\">\n");
          out.write("                                <span>$100.00</span>\n");
          out.write("                                <span class=\"discount-price\">$200.00</span>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                     End Single Product \n");
          out.write("                </div>\n");
          out.write("                <div class=\"col-lg-3 col-md-6 col-12\">\n");
          out.write("                     Start Single Product \n");
          out.write("                    <div class=\"single-product\">\n");
          out.write("                        <div class=\"product-image\">\n");
          out.write("                            <img src=\"assets/images/products/product-8.jpg\" alt=\"#\">\n");
          out.write("                            <div class=\"button\">\n");
          out.write("                                <a href=\"product-details.html\" class=\"btn\"><i class=\"lni lni-cart\"></i> Add to Cart</a>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"product-info\">\n");
          out.write("                            <span class=\"category\">Laptop</span>\n");
          out.write("                            <h4 class=\"title\">\n");
          out.write("                                <a href=\"product-grids.html\">Apple MacBook Air</a>\n");
          out.write("                            </h4>\n");
          out.write("                            <ul class=\"review\">\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\n");
          out.write("                                <li><span>5.0 Review(s)</span></li>\n");
          out.write("                            </ul>\n");
          out.write("                            <div class=\"price\">\n");
          out.write("                                <span>$899.00</span>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                     End Single Product \n");
          out.write("</div>-->\n");
          out.write("         ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
