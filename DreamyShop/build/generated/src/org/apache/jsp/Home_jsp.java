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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html class=\"no-js\" lang=\"zxx\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\" />\r\n");
      out.write("    <title>ShopGrids - Bootstrap 5 eCommerce HTML Template.</title>\r\n");
      out.write("    <meta name=\"description\" content=\"\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/images/favicon.svg\" />\r\n");
      out.write("\r\n");
      out.write("    <!-- ========================= CSS here ========================= -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/LineIcons.3.0.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/tiny-slider.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/glightbox.min.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/main.css\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!--[if lte IE 9]>\r\n");
      out.write("      <p class=\"browserupgrade\">\r\n");
      out.write("        You are using an <strong>outdated</strong> browser. Please\r\n");
      out.write("        <a href=\"https://browsehappy.com/\">upgrade your browser</a> to improve\r\n");
      out.write("        your experience and security.\r\n");
      out.write("      </p>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    <!-- Preloader -->\r\n");
      out.write("    <div class=\"preloader\">\r\n");
      out.write("        <div class=\"preloader-inner\">\r\n");
      out.write("            <div class=\"preloader-icon\">\r\n");
      out.write("                <span></span>\r\n");
      out.write("                <span></span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /End Preloader -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Start Header Area -->\r\n");
      out.write("    <header class=\"header navbar-area\">\r\n");
      out.write("        <!-- Start Topbar -->\r\n");
      out.write("        <div class=\"topbar\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row align-items-center\">\r\n");
      out.write("                        <div class=\"col-lg-4 col-md-4 col-12\">\r\n");
      out.write("                           \r\n");
      out.write("                        </div>\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-4 col-12\">\r\n");
      out.write("                        <div class=\"top-middle\">\r\n");
      out.write("                            <ul class=\"useful-links\">\r\n");
      out.write("                                <li><a href=\"home\">Home</a></li>\r\n");
      out.write("                                <li><a href=\"about-us.html\">About Us</a></li>\r\n");
      out.write("                                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-4 col-12\">\r\n");
      out.write("                        <div class=\"top-end\">\r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            <ul class=\"user-login\">\r\n");
      out.write("                                ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- End Topbar -->\r\n");
      out.write("        <!-- Start Header Middle -->\r\n");
      out.write("        <div class=\"header-middle\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row align-items-center\">\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-3 col-7\">\r\n");
      out.write("                        <!-- Start Header Logo -->\r\n");
      out.write("                        <a class=\"navbar-brand\" href=\"home\">\r\n");
      out.write("                            <h1 style=\"color: aliceblue; font-size: medium;\"><img src=\"assets\\images\\logo\\taoanhdep_vinamilk_59684.png\" alt=\"Logo\"></h1>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <!-- End Header Logo -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-5 col-md-7 d-xs-none\">\r\n");
      out.write("                        <!-- Start Main Menu Search -->\r\n");
      out.write("                        <form action=\"search\" method=\"post\">\r\n");
      out.write("                        <div class=\"main-menu-search\">\r\n");
      out.write("                            <!-- navbar search start -->\r\n");
      out.write("                            <div class=\"navbar-search search-style-5\">\r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\"search-input\">\r\n");
      out.write("                                    <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${txtS}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txt\" type=\"text\" placeholder=\"Search\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"search-btn\">\r\n");
      out.write("                                    <button type=\"submit\"><i class=\"lni lni-search-alt\"></i></button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- navbar search Ends -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        <!-- End Main Menu Search -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-2 col-5\">\r\n");
      out.write("                        <div class=\"middle-right-area\">\r\n");
      out.write("                            <div class=\"nav-hotline\">\r\n");
      out.write("                                <i class=\"lni lni-phone\"></i>\r\n");
      out.write("                                <h3>Hotline:\r\n");
      out.write("                                    <span style=\"color: black;\">0333 044 220 </span>\r\n");
      out.write("                                </h3>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"navbar-cart\">\r\n");
      out.write("                                <div class=\"wishlist\">\r\n");
      out.write("                                    <a href=\"javascript:void(0)\">\r\n");
      out.write("                                        <i class=\"lni lni-heart\"></i>\r\n");
      out.write("                                        <span class=\"total-items\">0</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"cart-items\">\r\n");
      out.write("                                    <a href=\"Cart.jsp\" class=\"main-btn\">\r\n");
      out.write("                                        <i class=\"lni lni-cart\"></i>\r\n");
      out.write("                                        <span class=\"total-items\">2</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <!-- Shopping Item -->\r\n");
      out.write("                                    <div class=\"shopping-item\">\r\n");
      out.write("                                        <div class=\"dropdown-cart-header\">\r\n");
      out.write("                                            <span>2 Items</span>\r\n");
      out.write("                                            <a href=\"Cart.jsp\">View Cart</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <ul class=\"shopping-list\">\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <a href=\"javascript:void(0)\" class=\"remove\" title=\"Remove this item\"><i\r\n");
      out.write("                                                        class=\"lni lni-close\"></i></a>\r\n");
      out.write("                                                <div class=\"cart-img-head\">\r\n");
      out.write("                                                    <a class=\"cart-img\" href=\"product-details.html\"><img\r\n");
      out.write("                                                            src=\"assets/images/header/cart-items/item1.jpg\" alt=\"#\"></a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"content\">\r\n");
      out.write("                                                    <h4><a href=\"product-details.html\">\r\n");
      out.write("                                                            Apple Watch Series 6</a></h4>\r\n");
      out.write("                                                    <p class=\"quantity\">1x - <span class=\"amount\">$99.00</span></p>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                            <li>\r\n");
      out.write("                                                <a href=\"javascript:void(0)\" class=\"remove\" title=\"Remove this item\"><i\r\n");
      out.write("                                                        class=\"lni lni-close\"></i></a>\r\n");
      out.write("                                                <div class=\"cart-img-head\">\r\n");
      out.write("                                                    <a class=\"cart-img\" href=\"product-details.html\"><img\r\n");
      out.write("                                                            src=\"assets/images/header/cart-items/item2.jpg\" alt=\"#\"></a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"content\">\r\n");
      out.write("                                                    <h4><a href=\"product-details.html\">Wi-Fi Smart Camera</a></h4>\r\n");
      out.write("                                                    <p class=\"quantity\">1x - <span class=\"amount\">$35.00</span></p>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                        <div class=\"bottom\">\r\n");
      out.write("                                            <div class=\"total\">\r\n");
      out.write("                                                <span>Total</span>\r\n");
      out.write("                                                <span class=\"total-amount\">$134.00</span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"button\">\r\n");
      out.write("                                                <a href=\"checkout.html\" class=\"btn animate\">Checkout</a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <!--/ End Shopping Item --> \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- End Header Middle -->\r\n");
      out.write("        <!-- Start Header Bottom -->\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row align-items-center\">\r\n");
      out.write("                <div class=\"col-lg-8 col-md-6 col-12\">\r\n");
      out.write("                    <div class=\"nav-inner\">\r\n");
      out.write("                        <!-- Start Mega Category Menu -->\r\n");
      out.write("                        <div class=\"mega-category-menu\">\r\n");
      out.write("                            <span class=\"cat-button\"><i class=\"lni lni-menu\"></i>All Categories</span>\r\n");
      out.write("                            <ul class=\"sub-category\">\r\n");
      out.write("                                <li><a href=\"category\">All Game</a></li>\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- End Mega Category Menu -->\r\n");
      out.write("                        <!-- Start Navbar -->\r\n");
      out.write("                        <nav class=\"navbar navbar-expand-lg\">\r\n");
      out.write("                            <button class=\"navbar-toggler mobile-menu-btn\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("                                data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\"\r\n");
      out.write("                                aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                                <span class=\"toggler-icon\"></span>\r\n");
      out.write("                                <span class=\"toggler-icon\"></span>\r\n");
      out.write("                                <span class=\"toggler-icon\"></span>\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <div class=\"collapse navbar-collapse sub-menu-bar\" id=\"navbarSupportedContent\">\r\n");
      out.write("                                                            </div> \r\n");
      out.write("                        </nav>\r\n");
      out.write("                        <!-- End Navbar -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4 col-md-6 col-12\">\r\n");
      out.write("                    <!-- Start Nav Social -->\r\n");
      out.write("                    <div class=\"nav-social\">\r\n");
      out.write("                        <h5 class=\"title\">Follow Us:</h5>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"javascript:void(0)\"><i class=\"lni lni-facebook-filled\"></i></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"javascript:void(0)\"><i class=\"lni lni-twitter-original\"></i></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"javascript:void(0)\"><i class=\"lni lni-instagram\"></i></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"javascript:void(0)\"><i class=\"lni lni-skype\"></i></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- End Nav Social -->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- End Header Bottom -->\r\n");
      out.write("    </header>\r\n");
      out.write("    <!-- End Header Area -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Start Hero Area -->\r\n");
      out.write("    <section class=\"hero-area\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-8 col-12 custom-padding-right\">\r\n");
      out.write("                    <div class=\"slider-head\">\r\n");
      out.write("                        <!-- Start Hero Slider -->\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"hero-slider\">\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                       \r\n");
      out.write("                        <!-- End Hero Slider -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4 col-12\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-12 col-md-6 col-12 md-custom-padding\">\r\n");
      out.write("                            <!-- Start Small Banner -->\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"hero-small-banner\"\r\n");
      out.write("                                 \r\n");
      out.write("                                style=\"background-image: url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${n.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(");\">\r\n");
      out.write("                                <div class=\"content\">\r\n");
      out.write("                                    \r\n");
      out.write("                                    <b style=\"font-weight: 1000;\r\n");
      out.write("                                            font-size: larger;\r\n");
      out.write("                                                color: white;\r\n");
      out.write("                                            text-shadow: 2px 2px 4px black;\">NEW GAME</b>\r\n");
      out.write("<!--                                        <h1>\r\n");
      out.write("                                        \r\n");
      out.write("                                    </h1>\r\n");
      out.write("                                    <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${n.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" VND</h3>-->\r\n");
      out.write("                                </div>\r\n");
      out.write("                                 \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- End Small Banner -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-12 col-md-6 col-12\">\r\n");
      out.write("                            <!-- Start Small Banner -->\r\n");
      out.write("                            <div class=\"hero-small-banner style2\">\r\n");
      out.write("                                <div class=\"content\">\r\n");
      out.write("                                    <h2>Weekly Sale!</h2>\r\n");
      out.write("                                    <p>Saving up to 50% off all online store items this week.</p>\r\n");
      out.write("                                    <div class=\"button\">\r\n");
      out.write("                                        <a class=\"btn\" href=\"product-grids.html\">Shop Now</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Start Small Banner -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- End Hero Area -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Start Trending Product Area -->\r\n");
      out.write("    <section class=\"trending-product section\" >\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-12\">\r\n");
      out.write("                    <div class=\"section-title\">\r\n");
      out.write("                        <h2 style=\"color: #f189b1;\">Trending Product</h2>\r\n");
      out.write("                        <p>There are many variations of passages of Lorem Ipsum available, but the majority have\r\n");
      out.write("                            suffered alteration in some form.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("           \r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("            </div>\r\n");
      out.write("                               \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("    </section>\r\n");
      out.write("   \r\n");
      out.write("    <!-- End Call Action Area -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Start Banner Area -->\r\n");
      out.write("    <section class=\"banner section\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-6 col-md-6 col-12\">\r\n");
      out.write("                    <div class=\"single-banner\" style=\"background-image:url('assets/images/banner/banner-1-bg.jpg')\">\r\n");
      out.write("                        <div class=\"content\">\r\n");
      out.write("                            <h2>Smart Watch 2.0</h2>\r\n");
      out.write("                            <p>Space Gray Aluminum Case with <br>Black/Volt Real Sport Band </p>\r\n");
      out.write("                            <div class=\"button\">\r\n");
      out.write("                                <a href=\"product-grids.html\" class=\"btn\">View Details</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-6 col-md-6 col-12\">\r\n");
      out.write("                    <div class=\"single-banner custom-responsive-margin\"\r\n");
      out.write("                        style=\"background-image:url('assets/images/banner/banner-2-bg.jpg')\">\r\n");
      out.write("                        <div class=\"content\">\r\n");
      out.write("                            <h2>Smart Headphone</h2>\r\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, <br>eiusmod tempor\r\n");
      out.write("                                incididunt ut labore.</p>\r\n");
      out.write("                            <div class=\"button\">\r\n");
      out.write("                                <a href=\"product-grids.html\" class=\"btn\">Shop Now</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- End Banner Area -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Start Shipping Info -->\r\n");
      out.write("    <section class=\"shipping-info\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <!-- Free Shipping -->\r\n");
      out.write("                <li>\r\n");
      out.write("                    <div class=\"media-icon\">\r\n");
      out.write("                        <i class=\"lni lni-delivery\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"media-body\">\r\n");
      out.write("                        <h5>Free Shipping</h5>\r\n");
      out.write("                        <span>On order over $99</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- Money Return -->\r\n");
      out.write("                <li>\r\n");
      out.write("                    <div class=\"media-icon\">\r\n");
      out.write("                        <i class=\"lni lni-support\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"media-body\">\r\n");
      out.write("                        <h5>24/7 Support.</h5>\r\n");
      out.write("                        <span>Live Chat Or Call.</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- Support 24/7 -->\r\n");
      out.write("                <li>\r\n");
      out.write("                    <div class=\"media-icon\">\r\n");
      out.write("                        <i class=\"lni lni-credit-cards\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"media-body\">\r\n");
      out.write("                        <h5>Online Payment.</h5>\r\n");
      out.write("                        <span>Secure Payment Services.</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- Safe Payment -->\r\n");
      out.write("                <li>\r\n");
      out.write("                    <div class=\"media-icon\">\r\n");
      out.write("                        <i class=\"lni lni-reload\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"media-body\">\r\n");
      out.write("                        <h5>Easy Return.</h5>\r\n");
      out.write("                        <span>Hassle Free Shopping.</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- End Shipping Info -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Start Footer Area -->\r\n");
      out.write("    <footer class=\"footer\">\r\n");
      out.write("        \r\n");
      out.write("        <!-- Start Footer Middle -->\r\n");
      out.write("        <div class=\"footer-middle\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"bottom-inner\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-4 col-md-6 col-12\">\r\n");
      out.write("                            <!-- Single Widget -->\r\n");
      out.write("                            <div class=\"single-footer f-contact\">\r\n");
      out.write("                                <h3>Get In Touch With Us</h3>\r\n");
      out.write("                                <p class=\"phone\">Phone: +1 (900) 33 169 7720</p>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><span>Monday-Friday: </span> 9.00 am - 8.00 pm</li>\r\n");
      out.write("                                    <li><span>Saturday: </span> 10.00 am - 6.00 pm</li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                                <p class=\"mail\">\r\n");
      out.write("                                    <a href=\"mailto:support@shopgrids.com\">support@shopgrids.com</a>\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- End Single Widget -->\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-lg-4 col-md-6 col-12\">\r\n");
      out.write("                            <!-- Single Widget -->\r\n");
      out.write("                            <div class=\"single-footer f-link\">\r\n");
      out.write("                                <h3>Information</h3>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"javascript:void(0)\">About Us</a></li>\r\n");
      out.write("                                    <li><a href=\"javascript:void(0)\">Contact Us</a></li>\r\n");
      out.write("                                    <li><a href=\"javascript:void(0)\">Downloads</a></li>\r\n");
      out.write("                                    <li><a href=\"javascript:void(0)\">Sitemap</a></li>\r\n");
      out.write("                                    <li><a href=\"javascript:void(0)\">FAQs Page</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- End Single Widget -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-4 col-md-6 col-12\">\r\n");
      out.write("                            <!-- Single Widget -->\r\n");
      out.write("                            <div class=\"single-footer f-link\">\r\n");
      out.write("                                <h3>Shop Departments</h3>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"javascript:void(0)\">Computers & Accessories</a></li>\r\n");
      out.write("                                    <li><a href=\"javascript:void(0)\">Smartphones & Tablets</a></li>\r\n");
      out.write("                                    <li><a href=\"javascript:void(0)\">TV, Video & Audio</a></li>\r\n");
      out.write("                                    <li><a href=\"javascript:void(0)\">Cameras, Photo & Video</a></li>\r\n");
      out.write("                                    <li><a href=\"javascript:void(0)\">Headphones</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- End Single Widget -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- End Footer Middle -->\r\n");
      out.write("        \r\n");
      out.write("    </footer>\r\n");
      out.write("    <!--/ End Footer Area -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ========================= scroll-top ========================= -->\r\n");
      out.write("    <a href=\"#\" class=\"scroll-top\">\r\n");
      out.write("        <i class=\"lni lni-chevron-up\"></i>\r\n");
      out.write("    </a>\r\n");
      out.write("\r\n");
      out.write("    <!-- ========================= JS here ========================= -->\r\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/tiny-slider.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/glightbox.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/main.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        //========= Hero Slider \r\n");
      out.write("        tns({\r\n");
      out.write("            container: '.hero-slider',\r\n");
      out.write("            slideBy: 'page',\r\n");
      out.write("            autoplay: true,\r\n");
      out.write("            autoplayButtonOutput: false,\r\n");
      out.write("            mouseDrag: true,\r\n");
      out.write("            gutter: 0,\r\n");
      out.write("            items: 1,\r\n");
      out.write("            nav: false,\r\n");
      out.write("            controls: true,\r\n");
      out.write("            controlsText: ['<i class=\"lni lni-chevron-left\"></i>', '<i class=\"lni lni-chevron-right\"></i>'],\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //======== Brand Slider\r\n");
      out.write("        tns({\r\n");
      out.write("            container: '.brands-logo-carousel',\r\n");
      out.write("            autoplay: true,\r\n");
      out.write("            autoplayButtonOutput: false,\r\n");
      out.write("            mouseDrag: true,\r\n");
      out.write("            gutter: 15,\r\n");
      out.write("            nav: false,\r\n");
      out.write("            controls: false,\r\n");
      out.write("            responsive: {\r\n");
      out.write("                0: {\r\n");
      out.write("                    items: 1,\r\n");
      out.write("                },\r\n");
      out.write("                540: {\r\n");
      out.write("                    items: 3,\r\n");
      out.write("                },\r\n");
      out.write("                768: {\r\n");
      out.write("                    items: 5,\r\n");
      out.write("                },\r\n");
      out.write("                992: {\r\n");
      out.write("                    items: 6,\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
        out.write("\r\n");
        out.write("                                <li><a href=\"manager\">Manager Products</a></li>\r\n");
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
        out.write("\r\n");
        out.write("                            <div class=\"user\">\r\n");
        out.write("                                <i class=\"lni lni-user\"></i>\r\n");
        out.write("                                Hello ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
        out.write("                            </div>\r\n");
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
        out.write("\r\n");
        out.write("                                <li>\r\n");
        out.write("                                    <a href=\"Login.jsp\">Sign In</a>\r\n");
        out.write("                                </li>\r\n");
        out.write("                                <li>\r\n");
        out.write("                                    <a href=\"Signup.jsp\">Register</a>\r\n");
        out.write("                                </li>\r\n");
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
        out.write("\r\n");
        out.write("                                <li>\r\n");
        out.write("                                    <a href=\"logout\">Log Out</a>\r\n");
        out.write("                                </li>\r\n");
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
          out.write("\r\n");
          out.write("                                \r\n");
          out.write("                                <li><a href=\"category?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\r\n");
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
          out.write("\r\n");
          out.write("                            <!-- Start Single Slider -->\r\n");
          out.write("                            <div class=\"single-slider\"\r\n");
          out.write("                                style=\"background-image: url(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(");\">\r\n");
          out.write("                                <div class=\"content\">\r\n");
          out.write("                                    <strong style=\"font-weight: 1000;\r\n");
          out.write("                                font-size: larger;\r\n");
          out.write("                            color: white;\r\n");
          out.write("                            text-shadow: 2px 2px 2px black;\">BIG SALE</strong>\r\n");
          out.write("                                    <h1>\r\n");
          out.write("                                       \r\n");
          out.write("                                    </h1>\r\n");
          out.write("<!--                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor\r\n");
          out.write("                                        incididunt ut labore et dolore magna aliqua.</p>-->\r\n");
          out.write("                                    <h3 style=\"color: #fff\"><b style=\"color: #f189b1\">Now Only: </b> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" VND</h3>\r\n");
          out.write("                                    <div class=\"button\">\r\n");
          out.write("                                        <a href=\"product-grids.html\" class=\"btn\">BUY</a>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                            <!-- End Single Slider -->\r\n");
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
          out.write("\r\n");
          out.write("                    \r\n");
          out.write("                <div class=\"col-lg-3 col-md-6 col-12\">\r\n");
          out.write("                    \r\n");
          out.write("                    <!-- Start Single Product -->\r\n");
          out.write("                    <div class=\"single-product\">\r\n");
          out.write("                        \r\n");
          out.write("                        <div class=\"product-image\">\r\n");
          out.write("                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"#\">\r\n");
          out.write("                            <div class=\"button\">\r\n");
          out.write("                                <a href=\"product-details.html\" class=\"btn\"><i class=\"lni lni-cart\"></i> BUY</a>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                        <div class=\"product-info\">\r\n");
          out.write("                            <span class=\"category\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cateName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("                            <h4 class=\"title\">\r\n");
          out.write("                                <a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("                            </h4>\r\n");
          out.write("                            <ul class=\"review\">\r\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\r\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\r\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\r\n");
          out.write("                                <li><i class=\"lni lni-star-filled\"></i></li>\r\n");
          out.write("                                <li><i class=\"lni lni-star\"></i></li>\r\n");
          out.write("                                <li><span>4.0 Review(s)</span></li>\r\n");
          out.write("                            </ul>\r\n");
          out.write("                            <div class=\"price\">\r\n");
          out.write("                                <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" VND</span>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </div>\r\n");
          out.write("                     <!--End Single Product--> \r\n");
          out.write("                                                        \r\n");
          out.write("\r\n");
          out.write("                </div>\r\n");
          out.write("\r\n");
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
