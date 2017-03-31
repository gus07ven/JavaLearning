<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:msxsl="urn:schemas-microsoft-com:xslt" exclude-result-prefixes="msxsl"
>

  <xsl:template match="/hello-world">
    <html>
      <head>
        <title> First XSLT Lecture </title>
      </head>
      <body>
        <h1>
          <xsl:value-of select="greeting"/>  <!--value of and apply template are the same.-->
        </h1>
        <xsl:apply-templates select="greeter"/>
      </body>
    </html>
  </xsl:template>
  <xsl:template match="greeter">
    <div> from <I>
      <xsl:value-of select="."/>
    </I>
    </div>
  </xsl:template>
</xsl:stylesheet>
