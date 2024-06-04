<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="bookstore">
    <html>
      <body>
        <h2>Books</h2>
        <!-- Apply template to books published after 2000 -->
        <xsl:apply-templates select="book[year > 2000]"/>
        <h2>Cheap Books</h2>
        <!-- Apply template to books priced less than 30.00 -->
        <xsl:apply-templates select="book[price &lt; 30.00]"/>
        <h2>Fiction Books</h2>
        <!-- Apply template to books with category 'fiction' -->
        <xsl:apply-templates select="book[@category='fiction']"/>
      </body>
    </html>
</xsl:template>


<xsl:template match="book">
    <div>
      <p><strong>Title:</strong> <xsl:value-of select="title"/></p>
      <p><strong>Author:</strong> <xsl:value-of select="author"/></p>
      <p><strong>Year:</strong> <xsl:value-of select="year"/></p>
      <p><strong>Price:</strong> <xsl:value-of select="price"/></p>
    </div>
</xsl:template>

</xsl:stylesheet>