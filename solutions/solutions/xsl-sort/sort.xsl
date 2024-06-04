<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">

<html>
    <style>
        div{
            display:flex;
            gap:1rem;
        }
    </style>
    <body>
        
        <xsl:for-each select="items/item">
            <xsl:sort select="price" />
            <div>

                <p>
                    <xsl:value-of select="name"></xsl:value-of>
                </p>
                <p>
                    <xsl:value-of select="price"></xsl:value-of>
                </p>
            </div>
        </xsl:for-each>

        
    </body>
</html>

</xsl:template>
</xsl:stylesheet>