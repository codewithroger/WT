<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <!-- Template to match bookstore -->
  <xsl:template match="bookstore">
    <html>
      <body>
        <h2>Books</h2>
        <table border="1">
          <tr>
            <th>Title</th>
            <th>Price</th>
            <th>Price after 10% increase</th>
          </tr>
          <!-- Apply template to each book -->
          <xsl:apply-templates select="book"/>
        </table>
      </body>
    </html>
  </xsl:template>

  <!-- Template to match book elements -->
  <xsl:template match="book">
    <tr>
      <td><xsl:value-of select="title"/></td>
      <td><xsl:value-of select="price"/></td>
      <!-- Calculate price after 10% increase using XPath function -->
      <td><xsl:value-of select="format-number(price * 1.10, '0.00')"/></td>
    </tr>
  </xsl:template>

</xsl:stylesheet>
