package com.itextpdf.html2pdf.css.w3c.css21.text;

import com.itextpdf.html2pdf.css.w3c.W3CCssAhemFontTest;

public class WhiteSpaceAppliesTo010Test extends W3CCssAhemFontTest {
    // TODO DEVSIX-2445: display: table-footer-group; is not supported
    @Override
    protected String getHtmlFileName() {
        return "white-space-applies-to-010.xht";
    }
}