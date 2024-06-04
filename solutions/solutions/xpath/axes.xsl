<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <!-- Template to match bookstore -->
  <xsl:template match="bookstore">
    <html>
      <body>
        <h2>Authors</h2>
        <!-- Using child axis to select author elements -->
        <xsl:apply-templates select="book/author"/>
        
        <h2>Titles</h2>
        <!-- Using parent axis to select parent elements of title -->
        <xsl:apply-templates select="book/title/.."/>
        
        <h2>Preceding Siblings</h2>
        <!-- Using preceding-sibling axis to select preceding siblings of a book -->
        <xsl:apply-templates select="book[3]/preceding-sibling::book"/>
      </body>
    </html>
  </xsl:template>

  <!-- Template to match author elements -->
  <xsl:template match="author">
    <p><xsl:value-of select="."/></p>
  </xsl:template>

  <!-- Template to match parent elements of title -->
  <xsl:template match="book">
    <p><xsl:value-of select="title"/></p>
  </xsl:template>

</xsl:stylesheet>
