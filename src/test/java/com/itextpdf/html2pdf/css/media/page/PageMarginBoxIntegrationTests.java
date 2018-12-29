package com.itextpdf.html2pdf.css.media.page;

import com.itextpdf.html2pdf.ExtendedHtmlConversionITextTest;
import com.itextpdf.test.annotations.type.IntegrationTest;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.IOException;

@Category(IntegrationTest.class)
public class PageMarginBoxIntegrationTests extends ExtendedHtmlConversionITextTest {


    public static final String sourceFolder = "./src/test/resources/com/itextpdf/html2pdf/css/media/page/PageMarginBoxIntegrationTests/";
    public static final String destinationFolder = "./target/test/com/itextpdf/html2pdf/css/media/page/PageMarginBoxIntegrationTests/";

    @BeforeClass
    public static void beforeClass() {
        createOrClearDestinationFolder(destinationFolder);
    }


    @Test
    public void headerFooterTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("headerFooter", sourceFolder, destinationFolder);
    }

    @Test
    public void pageWidthContentTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("css-page-width-content", sourceFolder, destinationFolder);
    }

    @Test
    public void pageWidthElementTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("css-page-width-element", sourceFolder, destinationFolder);
    }

    // Top margin box tests
    @Test
    public void topOnlyLeftTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("topOnlyLeft", sourceFolder, destinationFolder);
    }

    @Test
    public void topOnlyRightTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("topOnlyRight", sourceFolder, destinationFolder);
    }

    @Test
    public void topOnlyCenterTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("topOnlyCenter", sourceFolder, destinationFolder);
    }

    @Test
    public void topCenterAndRight() throws IOException, InterruptedException {
        convertToPdfAndCompare("topCenterAndRight", sourceFolder, destinationFolder);
    }

    @Test
    public void topLeftAndCenter() throws IOException, InterruptedException {
        convertToPdfAndCompare("topLeftAndCenter", sourceFolder, destinationFolder);
    }

    @Test
    public void topLeftAndRight() throws IOException, InterruptedException {
        convertToPdfAndCompare("topLeftAndRight", sourceFolder, destinationFolder);
    }

    @Test
    public void topLeftAndCenterAndRight() throws IOException, InterruptedException {
        convertToPdfAndCompare("topLeftAndCenterAndRight", sourceFolder, destinationFolder);
    }

    //Bottom margin box tests
    @Test
    public void bottomOnlyLeftTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("bottomOnlyLeft", sourceFolder, destinationFolder);
    }

    @Test
    public void bottomOnlyRightTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("bottomOnlyRight", sourceFolder, destinationFolder);
    }

    @Test
    public void bottomOnlyCenterTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("bottomOnlyCenter", sourceFolder, destinationFolder);
    }

    @Test
    public void bottomCenterAndRight() throws IOException, InterruptedException {
        convertToPdfAndCompare("bottomCenterAndRight", sourceFolder, destinationFolder);
    }

    @Test
    public void bottomLeftAndCenter() throws IOException, InterruptedException {
        convertToPdfAndCompare("bottomLeftAndCenter", sourceFolder, destinationFolder);
    }

    @Test
    public void bottomLeftAndRight() throws IOException, InterruptedException {
        convertToPdfAndCompare("bottomLeftAndRight", sourceFolder, destinationFolder);
    }

    @Test
    public void bottomLeftAndCenterAndRight() throws IOException, InterruptedException {
        convertToPdfAndCompare("bottomLeftAndCenterAndRight", sourceFolder, destinationFolder);
    }

    //Left margin box tests
    @Test
    public void leftOnlyTopTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("leftOnlyTop", sourceFolder, destinationFolder);
    }

    @Test
    public void leftOnlyCenterTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("leftOnlyCenter", sourceFolder, destinationFolder);
    }

    @Test
    public void leftOnlyBottomTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("leftOnlyBottom", sourceFolder, destinationFolder);
    }

    @Test
    public void leftTopAndCenterTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("leftTopAndCenter", sourceFolder, destinationFolder);
    }

    @Test
    public void leftTopAndBottomTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("leftTopAndBottom", sourceFolder, destinationFolder);
    }

    @Test
    public void leftCenterAndBottomTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("leftCenterAndBottom", sourceFolder, destinationFolder);
    }

    @Test
    public void leftTopAndCenterAndBottomTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("leftTopAndCenterAndBottom", sourceFolder, destinationFolder);
    }

    //Right margin box tests
    @Test
    public void rightOnlyTopTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("rightOnlyTop", sourceFolder, destinationFolder);
    }

    @Test
    public void rightOnlyCenterTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("rightOnlyCenter", sourceFolder, destinationFolder);
    }

    @Test
    public void rightOnlyBottomTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("rightOnlyBottom", sourceFolder, destinationFolder);
    }

    @Test
    public void rightTopAndCenterTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("rightTopAndCenter", sourceFolder, destinationFolder);
    }

    @Test
    public void rightTopAndBottomTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("rightTopAndBottom", sourceFolder, destinationFolder);
    }

    @Test
    public void rightCenterAndBottomTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("rightCenterAndBottom", sourceFolder, destinationFolder);
    }

    @Test
    public void rightTopAndCenterAndBottomTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("rightTopAndCenterAndBottom", sourceFolder, destinationFolder);
    }
}
