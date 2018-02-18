import dispatch._, Defaults._

val request = url("http://freegeoip.net/xml/www.google.com")

val result = Http.default(request OK as.xml.Elem)

/*

<Response>
    <IP>216.58.217.164</IP>
    <CountryCode>US</CountryCode>
    <CountryName>United States</CountryName>
    <RegionCode>CA</RegionCode>
    <RegionName>California</RegionName>
    <City>Mountain View</City>
    <ZipCode>94043</ZipCode>
    <TimeZone>America/Los_Angeles</TimeZone>
    <Latitude>37.4192</Latitude>
    <Longitude>-122.0574</Longitude>
    <MetroCode>807</MetroCode>
</Response>

 */

val resultAsXML = result()

def printer = new scala.xml.PrettyPrinter(90, 2)

for(xml <- resultAsXML)
  println(printer.format(xml))



