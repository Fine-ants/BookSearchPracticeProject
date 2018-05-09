package com.example.jorda.booksearchpracticeproject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jorda on 5/9/2018.
 */

public class Utils {

    public static ArrayList<Book> fetchVolumesFromJson(){
        String placeholderJson = "{\n" +
                " \"kind\": \"books#volumes\",\n" +
                " \"totalItems\": 3266,\n" +
                " \"items\": [\n" +
                "  {\n" +
                "   \"kind\": \"books#volume\",\n" +
                "   \"id\": \"BUN807I0V4oC\",\n" +
                "   \"etag\": \"QaukBSM3mqU\",\n" +
                "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/BUN807I0V4oC\",\n" +
                "   \"volumeInfo\": {\n" +
                "    \"title\": \"The Everything Quilting Book\",\n" +
                "    \"subtitle\": \"Simple Instructions for Creating the Perfect Family Heirloom\",\n" +
                "    \"authors\": [\n" +
                "     \"Sandra Detrixhe\"\n" +
                "    ],\n" +
                "    \"publisher\": \"Everything Books\",\n" +
                "    \"publishedDate\": \"2003-10-01\",\n" +
                "    \"description\": \"The Everything Quilting Book, which covers hand and machine quilting, features a color insert, as well as easy-to-follow illustrations that will have readers creating and admiring their craftsmanship in no time.\",\n" +
                "    \"industryIdentifiers\": [\n" +
                "     {\n" +
                "      \"type\": \"ISBN_10\",\n" +
                "      \"identifier\": \"1580628729\"\n" +
                "     },\n" +
                "     {\n" +
                "      \"type\": \"ISBN_13\",\n" +
                "      \"identifier\": \"9781580628723\"\n" +
                "     }\n" +
                "    ],\n" +
                "    \"readingModes\": {\n" +
                "     \"text\": false,\n" +
                "     \"image\": true\n" +
                "    },\n" +
                "    \"pageCount\": 304,\n" +
                "    \"printType\": \"BOOK\",\n" +
                "    \"categories\": [\n" +
                "     \"Crafts & Hobbies\"\n" +
                "    ],\n" +
                "    \"maturityRating\": \"NOT_MATURE\",\n" +
                "    \"allowAnonLogging\": false,\n" +
                "    \"contentVersion\": \"3.0.0.0.preview.1\",\n" +
                "    \"imageLinks\": {\n" +
                "     \"smallThumbnail\": \"http://books.google.com/books/content?id=BUN807I0V4oC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "     \"thumbnail\": \"http://books.google.com/books/content?id=BUN807I0V4oC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "    },\n" +
                "    \"language\": \"en\",\n" +
                "    \"previewLink\": \"http://books.google.com/books?id=BUN807I0V4oC&printsec=frontcover&dq=quilting&hl=&cd=1&source=gbs_api\",\n" +
                "    \"infoLink\": \"http://books.google.com/books?id=BUN807I0V4oC&dq=quilting&hl=&source=gbs_api\",\n" +
                "    \"canonicalVolumeLink\": \"https://books.google.com/books/about/The_Everything_Quilting_Book.html?hl=&id=BUN807I0V4oC\"\n" +
                "   },\n" +
                "   \"saleInfo\": {\n" +
                "    \"country\": \"US\",\n" +
                "    \"saleability\": \"NOT_FOR_SALE\",\n" +
                "    \"isEbook\": false\n" +
                "   },\n" +
                "   \"accessInfo\": {\n" +
                "    \"country\": \"US\",\n" +
                "    \"viewability\": \"PARTIAL\",\n" +
                "    \"embeddable\": true,\n" +
                "    \"publicDomain\": false,\n" +
                "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "    \"epub\": {\n" +
                "     \"isAvailable\": false\n" +
                "    },\n" +
                "    \"pdf\": {\n" +
                "     \"isAvailable\": true\n" +
                "    },\n" +
                "    \"webReaderLink\": \"http://play.google.com/books/reader?id=BUN807I0V4oC&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "    \"accessViewStatus\": \"SAMPLE\",\n" +
                "    \"quoteSharingAllowed\": false\n" +
                "   },\n" +
                "   \"searchInfo\": {\n" +
                "    \"textSnippet\": \"The Everything Quilting Book, which covers hand and machine quilting, features a color insert, as well as easy-to-follow illustrations that will have readers creating and admiring their craftsmanship in no time.\"\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"books#volume\",\n" +
                "   \"id\": \"w8MUCgAAQBAJ\",\n" +
                "   \"etag\": \"kUvQmGD722Y\",\n" +
                "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/w8MUCgAAQBAJ\",\n" +
                "   \"volumeInfo\": {\n" +
                "    \"title\": \"Free-Motion Quilting Idea Book\",\n" +
                "    \"subtitle\": \"155 Mix & Match Designs - Bring 30 Fabulous Blocks to Life - Plus Plans for Sashing, Borders, Motifs & Allover Designs\",\n" +
                "    \"authors\": [\n" +
                "     \"Amanda Murphy\"\n" +
                "    ],\n" +
                "    \"publisher\": \"C&T Publishing Inc\",\n" +
                "    \"publishedDate\": \"2015-07-01\",\n" +
                "    \"description\": \"Take the guesswork out of free-motion quilting with 155 fresh ideas, each handpicked for a specific space on a quilt. Popular author Amanda Murphy pairs unique free-motion designs with 30 well-loved quilt blocks, such as the Sawtooth Star and Drunkard’s Path. Pick and choose elements from each chapter (borders, sashing, motifs, and more) for an artful finish! This must-have reference includes an inspiring gallery of quilts, expert advice on domestic and longarm quilting, and complete instructions for a table runner project to hone your skills.\",\n" +
                "    \"industryIdentifiers\": [\n" +
                "     {\n" +
                "      \"type\": \"ISBN_13\",\n" +
                "      \"identifier\": \"9781617451027\"\n" +
                "     },\n" +
                "     {\n" +
                "      \"type\": \"ISBN_10\",\n" +
                "      \"identifier\": \"1617451029\"\n" +
                "     }\n" +
                "    ],\n" +
                "    \"readingModes\": {\n" +
                "     \"text\": true,\n" +
                "     \"image\": false\n" +
                "    },\n" +
                "    \"pageCount\": 192,\n" +
                "    \"printType\": \"BOOK\",\n" +
                "    \"categories\": [\n" +
                "     \"Crafts & Hobbies\"\n" +
                "    ],\n" +
                "    \"averageRating\": 5.0,\n" +
                "    \"ratingsCount\": 1,\n" +
                "    \"maturityRating\": \"NOT_MATURE\",\n" +
                "    \"allowAnonLogging\": true,\n" +
                "    \"contentVersion\": \"2.2.2.0.preview.2\",\n" +
                "    \"panelizationSummary\": {\n" +
                "     \"containsEpubBubbles\": false,\n" +
                "     \"containsImageBubbles\": false\n" +
                "    },\n" +
                "    \"imageLinks\": {\n" +
                "     \"smallThumbnail\": \"http://books.google.com/books/content?id=w8MUCgAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "     \"thumbnail\": \"http://books.google.com/books/content?id=w8MUCgAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "    },\n" +
                "    \"language\": \"en\",\n" +
                "    \"previewLink\": \"http://books.google.com/books?id=w8MUCgAAQBAJ&printsec=frontcover&dq=quilting&hl=&cd=2&source=gbs_api\",\n" +
                "    \"infoLink\": \"https://play.google.com/store/books/details?id=w8MUCgAAQBAJ&source=gbs_api\",\n" +
                "    \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-w8MUCgAAQBAJ\"\n" +
                "   },\n" +
                "   \"saleInfo\": {\n" +
                "    \"country\": \"US\",\n" +
                "    \"saleability\": \"FOR_SALE\",\n" +
                "    \"isEbook\": true,\n" +
                "    \"listPrice\": {\n" +
                "     \"amount\": 9.99,\n" +
                "     \"currencyCode\": \"USD\"\n" +
                "    },\n" +
                "    \"retailPrice\": {\n" +
                "     \"amount\": 7.99,\n" +
                "     \"currencyCode\": \"USD\"\n" +
                "    },\n" +
                "    \"buyLink\": \"https://play.google.com/store/books/details?id=w8MUCgAAQBAJ&rdid=book-w8MUCgAAQBAJ&rdot=1&source=gbs_api\",\n" +
                "    \"offers\": [\n" +
                "     {\n" +
                "      \"finskyOfferType\": 1,\n" +
                "      \"listPrice\": {\n" +
                "       \"amountInMicros\": 9990000.0,\n" +
                "       \"currencyCode\": \"USD\"\n" +
                "      },\n" +
                "      \"retailPrice\": {\n" +
                "       \"amountInMicros\": 7990000.0,\n" +
                "       \"currencyCode\": \"USD\"\n" +
                "      },\n" +
                "      \"giftable\": true\n" +
                "     }\n" +
                "    ]\n" +
                "   },\n" +
                "   \"accessInfo\": {\n" +
                "    \"country\": \"US\",\n" +
                "    \"viewability\": \"PARTIAL\",\n" +
                "    \"embeddable\": true,\n" +
                "    \"publicDomain\": false,\n" +
                "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "    \"epub\": {\n" +
                "     \"isAvailable\": true,\n" +
                "     \"acsTokenLink\": \"http://books.google.com/books/download/Free_Motion_Quilting_Idea_Book-sample-epub.acsm?id=w8MUCgAAQBAJ&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
                "    },\n" +
                "    \"pdf\": {\n" +
                "     \"isAvailable\": false\n" +
                "    },\n" +
                "    \"webReaderLink\": \"http://play.google.com/books/reader?id=w8MUCgAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "    \"accessViewStatus\": \"SAMPLE\",\n" +
                "    \"quoteSharingAllowed\": false\n" +
                "   },\n" +
                "   \"searchInfo\": {\n" +
                "    \"textSnippet\": \"Popular author Amanda Murphy pairs unique free-motion designs with 30 well-loved quilt blocks, such as the Sawtooth Star and Drunkard’s Path.\"\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"books#volume\",\n" +
                "   \"id\": \"JlWhoFm8-TgC\",\n" +
                "   \"etag\": \"fP6seZs6spY\",\n" +
                "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/JlWhoFm8-TgC\",\n" +
                "   \"volumeInfo\": {\n" +
                "    \"title\": \"Quilting Modern\",\n" +
                "    \"subtitle\": \"Techniques and Projects for Improvisational Quilts\",\n" +
                "    \"authors\": [\n" +
                "     \"Jacquie Gering\",\n" +
                "     \"Katie Pedersen\"\n" +
                "    ],\n" +
                "    \"publisher\": \"Betterway Books\",\n" +
                "    \"publishedDate\": \"2013-08-14\",\n" +
                "    \"description\": \"From two pioneers of today's modern quilting movement, Quilting Modern teaches quilters how to use improvisational techniques to make graphic, contemporary quilts and quilted projects. Explore seven core techniques and multiple projects using each technique--all presented with detailed instructions. Also included is step-by-step direction from Jacquie Gering and Katie Pedersen on tools, materials, and quilting basics, as well as expert advice on color and design. New and seasoned quilting artists will love making stunning bed, wall hanging, pillowcase, and table accessory quilts with this must-have resource. Quilting Modern is a field guide for quilters who strive to break free from tradition and yearn to explore improvisational work. Quilters can make the 21 projects in the book, but will also come away with the new knowledge and skills to apply to their own unique designs. In Quilting Modern, quilters will find the support, structure, and encouragement they need to explore their own creativity and artistic vision.\",\n" +
                "    \"industryIdentifiers\": [\n" +
                "     {\n" +
                "      \"type\": \"ISBN_13\",\n" +
                "      \"identifier\": \"9781620331538\"\n" +
                "     },\n" +
                "     {\n" +
                "      \"type\": \"ISBN_10\",\n" +
                "      \"identifier\": \"1620331535\"\n" +
                "     }\n" +
                "    ],\n" +
                "    \"readingModes\": {\n" +
                "     \"text\": true,\n" +
                "     \"image\": true\n" +
                "    },\n" +
                "    \"pageCount\": 176,\n" +
                "    \"printType\": \"BOOK\",\n" +
                "    \"categories\": [\n" +
                "     \"Crafts & Hobbies\"\n" +
                "    ],\n" +
                "    \"averageRating\": 5.0,\n" +
                "    \"ratingsCount\": 1,\n" +
                "    \"maturityRating\": \"NOT_MATURE\",\n" +
                "    \"allowAnonLogging\": true,\n" +
                "    \"contentVersion\": \"1.3.2.0.preview.3\",\n" +
                "    \"panelizationSummary\": {\n" +
                "     \"containsEpubBubbles\": false,\n" +
                "     \"containsImageBubbles\": false\n" +
                "    },\n" +
                "    \"imageLinks\": {\n" +
                "     \"smallThumbnail\": \"http://books.google.com/books/content?id=JlWhoFm8-TgC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "     \"thumbnail\": \"http://books.google.com/books/content?id=JlWhoFm8-TgC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "    },\n" +
                "    \"language\": \"en\",\n" +
                "    \"previewLink\": \"http://books.google.com/books?id=JlWhoFm8-TgC&printsec=frontcover&dq=quilting&hl=&cd=3&source=gbs_api\",\n" +
                "    \"infoLink\": \"https://play.google.com/store/books/details?id=JlWhoFm8-TgC&source=gbs_api\",\n" +
                "    \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-JlWhoFm8-TgC\"\n" +
                "   },\n" +
                "   \"saleInfo\": {\n" +
                "    \"country\": \"US\",\n" +
                "    \"saleability\": \"FOR_SALE\",\n" +
                "    \"isEbook\": true,\n" +
                "    \"listPrice\": {\n" +
                "     \"amount\": 26.95,\n" +
                "     \"currencyCode\": \"USD\"\n" +
                "    },\n" +
                "    \"retailPrice\": {\n" +
                "     \"amount\": 14.55,\n" +
                "     \"currencyCode\": \"USD\"\n" +
                "    },\n" +
                "    \"buyLink\": \"https://play.google.com/store/books/details?id=JlWhoFm8-TgC&rdid=book-JlWhoFm8-TgC&rdot=1&source=gbs_api\",\n" +
                "    \"offers\": [\n" +
                "     {\n" +
                "      \"finskyOfferType\": 1,\n" +
                "      \"listPrice\": {\n" +
                "       \"amountInMicros\": 2.695E7,\n" +
                "       \"currencyCode\": \"USD\"\n" +
                "      },\n" +
                "      \"retailPrice\": {\n" +
                "       \"amountInMicros\": 1.455E7,\n" +
                "       \"currencyCode\": \"USD\"\n" +
                "      },\n" +
                "      \"giftable\": true\n" +
                "     }\n" +
                "    ]\n" +
                "   },\n" +
                "   \"accessInfo\": {\n" +
                "    \"country\": \"US\",\n" +
                "    \"viewability\": \"PARTIAL\",\n" +
                "    \"embeddable\": true,\n" +
                "    \"publicDomain\": false,\n" +
                "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "    \"epub\": {\n" +
                "     \"isAvailable\": true\n" +
                "    },\n" +
                "    \"pdf\": {\n" +
                "     \"isAvailable\": true\n" +
                "    },\n" +
                "    \"webReaderLink\": \"http://play.google.com/books/reader?id=JlWhoFm8-TgC&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "    \"accessViewStatus\": \"SAMPLE\",\n" +
                "    \"quoteSharingAllowed\": false\n" +
                "   },\n" +
                "   \"searchInfo\": {\n" +
                "    \"textSnippet\": \"Quilters can make the 21 projects in the book, but will also come away with the new knowledge and skills to apply to their own unique designs.\"\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"books#volume\",\n" +
                "   \"id\": \"bZ_JqLD6NAEC\",\n" +
                "   \"etag\": \"QSUmGrWYOsE\",\n" +
                "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/bZ_JqLD6NAEC\",\n" +
                "   \"volumeInfo\": {\n" +
                "    \"title\": \"Collaborative Quilting\",\n" +
                "    \"authors\": [\n" +
                "     \"Freddy Moran\",\n" +
                "     \"Gwen Marston\"\n" +
                "    ],\n" +
                "    \"publisher\": \"Sterling Publishing Company, Inc.\",\n" +
                "    \"publishedDate\": \"2006\",\n" +
                "    \"description\": \"A bold and unconventional tribute to artistic collaboration by two internationally recognized, award-winning authors. Freddy Moran and Gwen Marston have made beautiful quilts together despite their physical distance from each other--the stunning photos of their many creations prove it. They reveal the secrets of their success, including how to bridge style differences and use each person’s strengths to best advantage. Freddy, an expert in color, discusses her specialty, while Gwen talks about design principles. In addition, each artist offers ten personal tips and structured and unstructured projects to try, as well as ideas for putting them all together. A gorgeous gallery of quilts is sure to inspire needleworkers to combine forces. A Selection of the Crafters Choice Book Club.\",\n" +
                "    \"industryIdentifiers\": [\n" +
                "     {\n" +
                "      \"type\": \"ISBN_10\",\n" +
                "      \"identifier\": \"1402730438\"\n" +
                "     },\n" +
                "     {\n" +
                "      \"type\": \"ISBN_13\",\n" +
                "      \"identifier\": \"9781402730436\"\n" +
                "     }\n" +
                "    ],\n" +
                "    \"readingModes\": {\n" +
                "     \"text\": false,\n" +
                "     \"image\": true\n" +
                "    },\n" +
                "    \"pageCount\": 255,\n" +
                "    \"printType\": \"BOOK\",\n" +
                "    \"categories\": [\n" +
                "     \"Crafts & Hobbies\"\n" +
                "    ],\n" +
                "    \"averageRating\": 5.0,\n" +
                "    \"ratingsCount\": 1,\n" +
                "    \"maturityRating\": \"NOT_MATURE\",\n" +
                "    \"allowAnonLogging\": false,\n" +
                "    \"contentVersion\": \"0.1.1.0.preview.1\",\n" +
                "    \"imageLinks\": {\n" +
                "     \"smallThumbnail\": \"http://books.google.com/books/content?id=bZ_JqLD6NAEC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "     \"thumbnail\": \"http://books.google.com/books/content?id=bZ_JqLD6NAEC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "    },\n" +
                "    \"language\": \"en\",\n" +
                "    \"previewLink\": \"http://books.google.com/books?id=bZ_JqLD6NAEC&printsec=frontcover&dq=quilting&hl=&cd=4&source=gbs_api\",\n" +
                "    \"infoLink\": \"http://books.google.com/books?id=bZ_JqLD6NAEC&dq=quilting&hl=&source=gbs_api\",\n" +
                "    \"canonicalVolumeLink\": \"https://books.google.com/books/about/Collaborative_Quilting.html?hl=&id=bZ_JqLD6NAEC\"\n" +
                "   },\n" +
                "   \"saleInfo\": {\n" +
                "    \"country\": \"US\",\n" +
                "    \"saleability\": \"NOT_FOR_SALE\",\n" +
                "    \"isEbook\": false\n" +
                "   },\n" +
                "   \"accessInfo\": {\n" +
                "    \"country\": \"US\",\n" +
                "    \"viewability\": \"PARTIAL\",\n" +
                "    \"embeddable\": true,\n" +
                "    \"publicDomain\": false,\n" +
                "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "    \"epub\": {\n" +
                "     \"isAvailable\": false\n" +
                "    },\n" +
                "    \"pdf\": {\n" +
                "     \"isAvailable\": false\n" +
                "    },\n" +
                "    \"webReaderLink\": \"http://play.google.com/books/reader?id=bZ_JqLD6NAEC&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "    \"accessViewStatus\": \"SAMPLE\",\n" +
                "    \"quoteSharingAllowed\": false\n" +
                "   },\n" +
                "   \"searchInfo\": {\n" +
                "    \"textSnippet\": \"A gorgeous gallery of quilts is sure to inspire needleworkers to combine forces. A Selection of the Crafters Choice Book Club.\"\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"books#volume\",\n" +
                "   \"id\": \"yzpkvgAACAAJ\",\n" +
                "   \"etag\": \"5HAXwRzr3oU\",\n" +
                "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/yzpkvgAACAAJ\",\n" +
                "   \"volumeInfo\": {\n" +
                "    \"title\": \"The T-Shirt Quilt Book\",\n" +
                "    \"subtitle\": \"Recycle Your Tees Into One-Of-a-Kind Keepsakes - 8 Exciting Projects Plus Instructions for Designing Your Own\",\n" +
                "    \"authors\": [\n" +
                "     \"Carla Hegeman Crim\",\n" +
                "     \"Lindsay Conner\"\n" +
                "    ],\n" +
                "    \"publisher\": \"C&T Publishing\",\n" +
                "    \"publishedDate\": \"2017-07-01\",\n" +
                "    \"description\": \"Turn treasured tees into something brand new a T-shirt quilt! Sew 8 special memory quilts, from a pillow or baby throw to bed quilts in multiple sizes. Learn the secrets to choosing, cutting, and interfacing tees. Get troubleshooting tips, like working with too-small shirts and adding other clothing and fabric. Whether it's your first quilt or your hundredth, this book is filled with fresh ideas for piecing your T-shirts to help you celebrate those special times.\\\"\",\n" +
                "    \"industryIdentifiers\": [\n" +
                "     {\n" +
                "      \"type\": \"ISBN_10\",\n" +
                "      \"identifier\": \"161745530X\"\n" +
                "     },\n" +
                "     {\n" +
                "      \"type\": \"ISBN_13\",\n" +
                "      \"identifier\": \"9781617455308\"\n" +
                "     }\n" +
                "    ],\n" +
                "    \"readingModes\": {\n" +
                "     \"text\": false,\n" +
                "     \"image\": false\n" +
                "    },\n" +
                "    \"pageCount\": 80,\n" +
                "    \"printType\": \"BOOK\",\n" +
                "    \"categories\": [\n" +
                "     \"Crafts & Hobbies\"\n" +
                "    ],\n" +
                "    \"maturityRating\": \"NOT_MATURE\",\n" +
                "    \"allowAnonLogging\": false,\n" +
                "    \"contentVersion\": \"preview-1.0.0\",\n" +
                "    \"panelizationSummary\": {\n" +
                "     \"containsEpubBubbles\": false,\n" +
                "     \"containsImageBubbles\": false\n" +
                "    },\n" +
                "    \"imageLinks\": {\n" +
                "     \"smallThumbnail\": \"http://books.google.com/books/content?id=yzpkvgAACAAJ&printsec=frontcover&img=1&zoom=5&source=gbs_api\",\n" +
                "     \"thumbnail\": \"http://books.google.com/books/content?id=yzpkvgAACAAJ&printsec=frontcover&img=1&zoom=1&source=gbs_api\"\n" +
                "    },\n" +
                "    \"language\": \"en\",\n" +
                "    \"previewLink\": \"http://books.google.com/books?id=yzpkvgAACAAJ&dq=quilting&hl=&cd=5&source=gbs_api\",\n" +
                "    \"infoLink\": \"http://books.google.com/books?id=yzpkvgAACAAJ&dq=quilting&hl=&source=gbs_api\",\n" +
                "    \"canonicalVolumeLink\": \"https://books.google.com/books/about/The_T_Shirt_Quilt_Book.html?hl=&id=yzpkvgAACAAJ\"\n" +
                "   },\n" +
                "   \"saleInfo\": {\n" +
                "    \"country\": \"US\",\n" +
                "    \"saleability\": \"NOT_FOR_SALE\",\n" +
                "    \"isEbook\": false\n" +
                "   },\n" +
                "   \"accessInfo\": {\n" +
                "    \"country\": \"US\",\n" +
                "    \"viewability\": \"NO_PAGES\",\n" +
                "    \"embeddable\": false,\n" +
                "    \"publicDomain\": false,\n" +
                "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "    \"epub\": {\n" +
                "     \"isAvailable\": false\n" +
                "    },\n" +
                "    \"pdf\": {\n" +
                "     \"isAvailable\": false\n" +
                "    },\n" +
                "    \"webReaderLink\": \"http://play.google.com/books/reader?id=yzpkvgAACAAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "    \"accessViewStatus\": \"NONE\",\n" +
                "    \"quoteSharingAllowed\": false\n" +
                "   },\n" +
                "   \"searchInfo\": {\n" +
                "    \"textSnippet\": \"Provides instructions for transforming treasured T-shirts into a quilt, describing how to choose, cut, and interface the shirts and providing instructions for eight different quilts.\"\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"books#volume\",\n" +
                "   \"id\": \"qVjQAQAAQBAJ\",\n" +
                "   \"etag\": \"9W169jVHfj8\",\n" +
                "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/qVjQAQAAQBAJ\",\n" +
                "   \"volumeInfo\": {\n" +
                "    \"title\": \"Quilting with a Modern Slant\",\n" +
                "    \"subtitle\": \"People, Patterns, and Techniques Inspiring the Modern Quilt Community\",\n" +
                "    \"authors\": [\n" +
                "     \"Rachel May\"\n" +
                "    ],\n" +
                "    \"publisher\": \"Storey Publishing\",\n" +
                "    \"publishedDate\": \"2014-01-28\",\n" +
                "    \"description\": \"Modern quilting allows artists the freedom to expand on traditions and use fabrics, patterns, colors, and stitching innovatively to create exciting fresh designs. In Quilting with a Modern Slant, Rachel May introduces you to more than 70 modern quilters who have developed their own styles, methods, and aesthetics. Their ideas, quilts, tips, tutorials, and techniques will inspire you to try something new and follow your own creativity — wherever it leads.\",\n" +
                "    \"industryIdentifiers\": [\n" +
                "     {\n" +
                "      \"type\": \"ISBN_13\",\n" +
                "      \"identifier\": \"9781603428941\"\n" +
                "     },\n" +
                "     {\n" +
                "      \"type\": \"ISBN_10\",\n" +
                "      \"identifier\": \"1603428941\"\n" +
                "     }\n" +
                "    ],\n" +
                "    \"readingModes\": {\n" +
                "     \"text\": true,\n" +
                "     \"image\": true\n" +
                "    },\n" +
                "    \"pageCount\": 224,\n" +
                "    \"printType\": \"BOOK\",\n" +
                "    \"categories\": [\n" +
                "     \"Crafts & Hobbies\"\n" +
                "    ],\n" +
                "    \"averageRating\": 4.0,\n" +
                "    \"ratingsCount\": 2,\n" +
                "    \"maturityRating\": \"NOT_MATURE\",\n" +
                "    \"allowAnonLogging\": true,\n" +
                "    \"contentVersion\": \"2.3.4.0.preview.3\",\n" +
                "    \"panelizationSummary\": {\n" +
                "     \"containsEpubBubbles\": false,\n" +
                "     \"containsImageBubbles\": false\n" +
                "    },\n" +
                "    \"imageLinks\": {\n" +
                "     \"smallThumbnail\": \"http://books.google.com/books/content?id=qVjQAQAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "     \"thumbnail\": \"http://books.google.com/books/content?id=qVjQAQAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "    },\n" +
                "    \"language\": \"en\",\n" +
                "    \"previewLink\": \"http://books.google.com/books?id=qVjQAQAAQBAJ&printsec=frontcover&dq=quilting&hl=&cd=6&source=gbs_api\",\n" +
                "    \"infoLink\": \"https://play.google.com/store/books/details?id=qVjQAQAAQBAJ&source=gbs_api\",\n" +
                "    \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-qVjQAQAAQBAJ\"\n" +
                "   },\n" +
                "   \"saleInfo\": {\n" +
                "    \"country\": \"US\",\n" +
                "    \"saleability\": \"FOR_SALE\",\n" +
                "    \"isEbook\": true,\n" +
                "    \"listPrice\": {\n" +
                "     \"amount\": 15.95,\n" +
                "     \"currencyCode\": \"USD\"\n" +
                "    },\n" +
                "    \"retailPrice\": {\n" +
                "     \"amount\": 9.99,\n" +
                "     \"currencyCode\": \"USD\"\n" +
                "    },\n" +
                "    \"buyLink\": \"https://play.google.com/store/books/details?id=qVjQAQAAQBAJ&rdid=book-qVjQAQAAQBAJ&rdot=1&source=gbs_api\",\n" +
                "    \"offers\": [\n" +
                "     {\n" +
                "      \"finskyOfferType\": 1,\n" +
                "      \"listPrice\": {\n" +
                "       \"amountInMicros\": 1.595E7,\n" +
                "       \"currencyCode\": \"USD\"\n" +
                "      },\n" +
                "      \"retailPrice\": {\n" +
                "       \"amountInMicros\": 9990000.0,\n" +
                "       \"currencyCode\": \"USD\"\n" +
                "      },\n" +
                "      \"giftable\": true\n" +
                "     }\n" +
                "    ]\n" +
                "   },\n" +
                "   \"accessInfo\": {\n" +
                "    \"country\": \"US\",\n" +
                "    \"viewability\": \"PARTIAL\",\n" +
                "    \"embeddable\": true,\n" +
                "    \"publicDomain\": false,\n" +
                "    \"textToSpeechPermission\": \"ALLOWED_FOR_ACCESSIBILITY\",\n" +
                "    \"epub\": {\n" +
                "     \"isAvailable\": true,\n" +
                "     \"acsTokenLink\": \"http://books.google.com/books/download/Quilting_with_a_Modern_Slant-sample-epub.acsm?id=qVjQAQAAQBAJ&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
                "    },\n" +
                "    \"pdf\": {\n" +
                "     \"isAvailable\": true,\n" +
                "     \"acsTokenLink\": \"http://books.google.com/books/download/Quilting_with_a_Modern_Slant-sample-pdf.acsm?id=qVjQAQAAQBAJ&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
                "    },\n" +
                "    \"webReaderLink\": \"http://play.google.com/books/reader?id=qVjQAQAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "    \"accessViewStatus\": \"SAMPLE\",\n" +
                "    \"quoteSharingAllowed\": false\n" +
                "   },\n" +
                "   \"searchInfo\": {\n" +
                "    \"textSnippet\": \"Tour the varied world of modern quilting through the stories and works of more than 70 of its most exciting artists.\"\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"books#volume\",\n" +
                "   \"id\": \"OWc-DwAAQBAJ\",\n" +
                "   \"etag\": \"tC4ZZW/Is0c\",\n" +
                "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/OWc-DwAAQBAJ\",\n" +
                "   \"volumeInfo\": {\n" +
                "    \"title\": \"Rulerwork Quilting Idea Book\",\n" +
                "    \"subtitle\": \"59 Outline Designs to Fill with Free-Motion Quilting, Tips for Longarm and Domestic Machines\",\n" +
                "    \"authors\": [\n" +
                "     \"Amanda Murphy\"\n" +
                "    ],\n" +
                "    \"publisher\": \"C&T Publishing Inc\",\n" +
                "    \"publishedDate\": \"2018-02-01\",\n" +
                "    \"description\": \"Quilting rulers have long been used by longarm quilters to make uniform shapes while quilting, but now, with the advent of the domestic ruler foot, domestic quilters can join in on the fun, too! Amanda Murphy, best-selling author of the Free-Motion Quilting Idea Sampler, starts by showing you how to use 6 basic shapes of machine quilting rulers to lay a foundation for your quilting, then moves on to teaching you 59 different designs. Finish up by following Amanda’s suggestions for filling in the background space with free-motion quilting.\",\n" +
                "    \"industryIdentifiers\": [\n" +
                "     {\n" +
                "      \"type\": \"ISBN_13\",\n" +
                "      \"identifier\": \"9781617455742\"\n" +
                "     },\n" +
                "     {\n" +
                "      \"type\": \"ISBN_10\",\n" +
                "      \"identifier\": \"1617455741\"\n" +
                "     }\n" +
                "    ],\n" +
                "    \"readingModes\": {\n" +
                "     \"text\": true,\n" +
                "     \"image\": false\n" +
                "    },\n" +
                "    \"pageCount\": 196,\n" +
                "    \"printType\": \"BOOK\",\n" +
                "    \"categories\": [\n" +
                "     \"Crafts & Hobbies\"\n" +
                "    ],\n" +
                "    \"maturityRating\": \"NOT_MATURE\",\n" +
                "    \"allowAnonLogging\": false,\n" +
                "    \"contentVersion\": \"1.1.1.0.preview.2\",\n" +
                "    \"panelizationSummary\": {\n" +
                "     \"containsEpubBubbles\": false,\n" +
                "     \"containsImageBubbles\": false\n" +
                "    },\n" +
                "    \"imageLinks\": {\n" +
                "     \"smallThumbnail\": \"http://books.google.com/books/content?id=OWc-DwAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "     \"thumbnail\": \"http://books.google.com/books/content?id=OWc-DwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "    },\n" +
                "    \"language\": \"en\",\n" +
                "    \"previewLink\": \"http://books.google.com/books?id=OWc-DwAAQBAJ&printsec=frontcover&dq=quilting&hl=&cd=7&source=gbs_api\",\n" +
                "    \"infoLink\": \"https://play.google.com/store/books/details?id=OWc-DwAAQBAJ&source=gbs_api\",\n" +
                "    \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-OWc-DwAAQBAJ\"\n" +
                "   },\n" +
                "   \"saleInfo\": {\n" +
                "    \"country\": \"US\",\n" +
                "    \"saleability\": \"FOR_SALE\",\n" +
                "    \"isEbook\": true,\n" +
                "    \"listPrice\": {\n" +
                "     \"amount\": 15.99,\n" +
                "     \"currencyCode\": \"USD\"\n" +
                "    },\n" +
                "    \"retailPrice\": {\n" +
                "     \"amount\": 9.99,\n" +
                "     \"currencyCode\": \"USD\"\n" +
                "    },\n" +
                "    \"buyLink\": \"https://play.google.com/store/books/details?id=OWc-DwAAQBAJ&rdid=book-OWc-DwAAQBAJ&rdot=1&source=gbs_api\",\n" +
                "    \"offers\": [\n" +
                "     {\n" +
                "      \"finskyOfferType\": 1,\n" +
                "      \"listPrice\": {\n" +
                "       \"amountInMicros\": 1.599E7,\n" +
                "       \"currencyCode\": \"USD\"\n" +
                "      },\n" +
                "      \"retailPrice\": {\n" +
                "       \"amountInMicros\": 9990000.0,\n" +
                "       \"currencyCode\": \"USD\"\n" +
                "      },\n" +
                "      \"giftable\": true\n" +
                "     }\n" +
                "    ]\n" +
                "   },\n" +
                "   \"accessInfo\": {\n" +
                "    \"country\": \"US\",\n" +
                "    \"viewability\": \"PARTIAL\",\n" +
                "    \"embeddable\": true,\n" +
                "    \"publicDomain\": false,\n" +
                "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "    \"epub\": {\n" +
                "     \"isAvailable\": true,\n" +
                "     \"acsTokenLink\": \"http://books.google.com/books/download/Rulerwork_Quilting_Idea_Book-sample-epub.acsm?id=OWc-DwAAQBAJ&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
                "    },\n" +
                "    \"pdf\": {\n" +
                "     \"isAvailable\": false\n" +
                "    },\n" +
                "    \"webReaderLink\": \"http://play.google.com/books/reader?id=OWc-DwAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "    \"accessViewStatus\": \"SAMPLE\",\n" +
                "    \"quoteSharingAllowed\": false\n" +
                "   },\n" +
                "   \"searchInfo\": {\n" +
                "    \"textSnippet\": \"Amanda Murphy, best-selling author of the Free-Motion Quilting Idea Sampler, starts by showing you how to use 6 basic shapes of machine quilting rulers to lay a foundation for your quilting, then moves on to teaching you 59 different ...\"\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"books#volume\",\n" +
                "   \"id\": \"e6eplcSVlIsC\",\n" +
                "   \"etag\": \"e7/NXonhl5E\",\n" +
                "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/e6eplcSVlIsC\",\n" +
                "   \"volumeInfo\": {\n" +
                "    \"title\": \"Modern Log Cabin Quilting\",\n" +
                "    \"subtitle\": \"25 Simple Quilts and Patchwork Projects\",\n" +
                "    \"authors\": [\n" +
                "     \"Susan Beal\"\n" +
                "    ],\n" +
                "    \"publisher\": \"Potter Craft\",\n" +
                "    \"publishedDate\": \"2012-05-09\",\n" +
                "    \"description\": \"If you think quilting is too difficult or too complicated, you’re not alone. Cutting hundreds of pieces and joining angled seams can be tough work! But log cabin quilting—an artful and simple way to piece strips of fabric around a central square—is different. From the intuitive construction through the straight-line stitching, this style of quilting is simple as can be. In Modern Log Cabin Quilting, Susan Beal outlines the entire process from start to finish, including basic quilting how-to as well as extensive design, fabric, and embellishment information. Since all log cabin designs follow the same formula, once you master straight lines and right angles, any of the 25 projects in this book are possible. From stash-friendly designs like the Charming Camera Case to more ambitious undertakings like the Vintage Linens Quilt, there’s sure to be a project that will get you into (or bring you back to) quilting! From the Trade Paperback edition.\",\n" +
                "    \"industryIdentifiers\": [\n" +
                "     {\n" +
                "      \"type\": \"ISBN_13\",\n" +
                "      \"identifier\": \"9780307586797\"\n" +
                "     },\n" +
                "     {\n" +
                "      \"type\": \"ISBN_10\",\n" +
                "      \"identifier\": \"0307586790\"\n" +
                "     }\n" +
                "    ],\n" +
                "    \"readingModes\": {\n" +
                "     \"text\": true,\n" +
                "     \"image\": false\n" +
                "    },\n" +
                "    \"pageCount\": 160,\n" +
                "    \"printType\": \"BOOK\",\n" +
                "    \"categories\": [\n" +
                "     \"Crafts & Hobbies\"\n" +
                "    ],\n" +
                "    \"averageRating\": 4.5,\n" +
                "    \"ratingsCount\": 2,\n" +
                "    \"maturityRating\": \"NOT_MATURE\",\n" +
                "    \"allowAnonLogging\": true,\n" +
                "    \"contentVersion\": \"2.9.10.0.preview.2\",\n" +
                "    \"panelizationSummary\": {\n" +
                "     \"containsEpubBubbles\": false,\n" +
                "     \"containsImageBubbles\": false\n" +
                "    },\n" +
                "    \"imageLinks\": {\n" +
                "     \"smallThumbnail\": \"http://books.google.com/books/content?id=e6eplcSVlIsC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "     \"thumbnail\": \"http://books.google.com/books/content?id=e6eplcSVlIsC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "    },\n" +
                "    \"language\": \"en\",\n" +
                "    \"previewLink\": \"http://books.google.com/books?id=e6eplcSVlIsC&printsec=frontcover&dq=quilting&hl=&cd=8&source=gbs_api\",\n" +
                "    \"infoLink\": \"https://play.google.com/store/books/details?id=e6eplcSVlIsC&source=gbs_api\",\n" +
                "    \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-e6eplcSVlIsC\"\n" +
                "   },\n" +
                "   \"saleInfo\": {\n" +
                "    \"country\": \"US\",\n" +
                "    \"saleability\": \"FOR_SALE\",\n" +
                "    \"isEbook\": true,\n" +
                "    \"listPrice\": {\n" +
                "     \"amount\": 9.99,\n" +
                "     \"currencyCode\": \"USD\"\n" +
                "    },\n" +
                "    \"retailPrice\": {\n" +
                "     \"amount\": 9.99,\n" +
                "     \"currencyCode\": \"USD\"\n" +
                "    },\n" +
                "    \"buyLink\": \"https://play.google.com/store/books/details?id=e6eplcSVlIsC&rdid=book-e6eplcSVlIsC&rdot=1&source=gbs_api\",\n" +
                "    \"offers\": [\n" +
                "     {\n" +
                "      \"finskyOfferType\": 1,\n" +
                "      \"listPrice\": {\n" +
                "       \"amountInMicros\": 9990000.0,\n" +
                "       \"currencyCode\": \"USD\"\n" +
                "      },\n" +
                "      \"retailPrice\": {\n" +
                "       \"amountInMicros\": 9990000.0,\n" +
                "       \"currencyCode\": \"USD\"\n" +
                "      },\n" +
                "      \"giftable\": true\n" +
                "     }\n" +
                "    ]\n" +
                "   },\n" +
                "   \"accessInfo\": {\n" +
                "    \"country\": \"US\",\n" +
                "    \"viewability\": \"PARTIAL\",\n" +
                "    \"embeddable\": true,\n" +
                "    \"publicDomain\": false,\n" +
                "    \"textToSpeechPermission\": \"ALLOWED_FOR_ACCESSIBILITY\",\n" +
                "    \"epub\": {\n" +
                "     \"isAvailable\": true,\n" +
                "     \"acsTokenLink\": \"http://books.google.com/books/download/Modern_Log_Cabin_Quilting-sample-epub.acsm?id=e6eplcSVlIsC&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
                "    },\n" +
                "    \"pdf\": {\n" +
                "     \"isAvailable\": false\n" +
                "    },\n" +
                "    \"webReaderLink\": \"http://play.google.com/books/reader?id=e6eplcSVlIsC&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "    \"accessViewStatus\": \"SAMPLE\",\n" +
                "    \"quoteSharingAllowed\": false\n" +
                "   },\n" +
                "   \"searchInfo\": {\n" +
                "    \"textSnippet\": \"Since all log cabin designs follow the same formula, once you master straight lines and right angles, any of the 25 projects in this book are possible.\"\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"books#volume\",\n" +
                "   \"id\": \"juQsDwAAQBAJ\",\n" +
                "   \"etag\": \"GKvONsvIaME\",\n" +
                "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/juQsDwAAQBAJ\",\n" +
                "   \"volumeInfo\": {\n" +
                "    \"title\": \"Red & White Quilting\",\n" +
                "    \"subtitle\": \"An Iconic Tradition in 40 Blocks\",\n" +
                "    \"authors\": [\n" +
                "     \"Linda Pumphrey\"\n" +
                "    ],\n" +
                "    \"publisher\": \"\\\"F+W Media, Inc.\\\"\",\n" +
                "    \"publishedDate\": \"2017-10-18\",\n" +
                "    \"description\": \"From basic quilting and finishing techniques with tips on two-color quilting to working with fabric dies and choosing fabric and batting, [this] offers a comprehensive guide to every aspect of this traditional quilting method. Plus, learn the history of 'Turkey red' fabric, create your own red and white home decor with projects and patterns for 14 finished designs and explore a gallery of historic red-and-white quilts for even more inspiration.\",\n" +
                "    \"industryIdentifiers\": [\n" +
                "     {\n" +
                "      \"type\": \"ISBN_13\",\n" +
                "      \"identifier\": \"9781440247446\"\n" +
                "     },\n" +
                "     {\n" +
                "      \"type\": \"ISBN_10\",\n" +
                "      \"identifier\": \"1440247447\"\n" +
                "     }\n" +
                "    ],\n" +
                "    \"readingModes\": {\n" +
                "     \"text\": false,\n" +
                "     \"image\": true\n" +
                "    },\n" +
                "    \"pageCount\": 160,\n" +
                "    \"printType\": \"BOOK\",\n" +
                "    \"categories\": [\n" +
                "     \"Patchwork\"\n" +
                "    ],\n" +
                "    \"maturityRating\": \"NOT_MATURE\",\n" +
                "    \"allowAnonLogging\": false,\n" +
                "    \"contentVersion\": \"preview-1.0.0\",\n" +
                "    \"panelizationSummary\": {\n" +
                "     \"containsEpubBubbles\": false,\n" +
                "     \"containsImageBubbles\": false\n" +
                "    },\n" +
                "    \"imageLinks\": {\n" +
                "     \"smallThumbnail\": \"http://books.google.com/books/content?id=juQsDwAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "     \"thumbnail\": \"http://books.google.com/books/content?id=juQsDwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "    },\n" +
                "    \"language\": \"en\",\n" +
                "    \"previewLink\": \"http://books.google.com/books?id=juQsDwAAQBAJ&printsec=frontcover&dq=quilting&hl=&cd=9&source=gbs_api\",\n" +
                "    \"infoLink\": \"http://books.google.com/books?id=juQsDwAAQBAJ&dq=quilting&hl=&source=gbs_api\",\n" +
                "    \"canonicalVolumeLink\": \"https://books.google.com/books/about/Red_White_Quilting.html?hl=&id=juQsDwAAQBAJ\"\n" +
                "   },\n" +
                "   \"saleInfo\": {\n" +
                "    \"country\": \"US\",\n" +
                "    \"saleability\": \"NOT_FOR_SALE\",\n" +
                "    \"isEbook\": false\n" +
                "   },\n" +
                "   \"accessInfo\": {\n" +
                "    \"country\": \"US\",\n" +
                "    \"viewability\": \"PARTIAL\",\n" +
                "    \"embeddable\": true,\n" +
                "    \"publicDomain\": false,\n" +
                "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "    \"epub\": {\n" +
                "     \"isAvailable\": false\n" +
                "    },\n" +
                "    \"pdf\": {\n" +
                "     \"isAvailable\": false\n" +
                "    },\n" +
                "    \"webReaderLink\": \"http://play.google.com/books/reader?id=juQsDwAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "    \"accessViewStatus\": \"SAMPLE\",\n" +
                "    \"quoteSharingAllowed\": false\n" +
                "   },\n" +
                "   \"searchInfo\": {\n" +
                "    \"textSnippet\": \"From basic quilting and finishing techniques with tips on two-color quilting to working with fabric dies and choosing fabric and batting, [this] offers a comprehensive guide to every aspect of this traditional quilting method.\"\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"books#volume\",\n" +
                "   \"id\": \"VZ5IPQAACAAJ\",\n" +
                "   \"etag\": \"eXJWzGNU/YE\",\n" +
                "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/VZ5IPQAACAAJ\",\n" +
                "   \"volumeInfo\": {\n" +
                "    \"title\": \"Judy Martin's Log Cabin Quilt Book\",\n" +
                "    \"authors\": [\n" +
                "     \"Judy Martin\"\n" +
                "    ],\n" +
                "    \"publisher\": \"Crosley-Griffth Publishing Company\",\n" +
                "    \"publishedDate\": \"2007-01-01\",\n" +
                "    \"description\": \"Judy Martin's Log Cabin Quilt Book provides 16 complete patterns for that all-time favorite quilt design, the Log Cabin. 15 of the patterns are new and original from the fertile mind of Judy Martin. She also provides 1 traditional pattern for those who want to start with the basics before moving on to more interesting variations. Chapters cover everything you will ever need to know about Log Cabins, including fabric selection, sets, keeping track of the logs, machine piecing, borders, quilting, binding, and individualizing your quilt. This lavishly illustrated volume is Judy Martin's 19th book on quilting, her 2nd devoted to Log Cabins. She has designed more original patterns than anyone in history.\",\n" +
                "    \"industryIdentifiers\": [\n" +
                "     {\n" +
                "      \"type\": \"ISBN_10\",\n" +
                "      \"identifier\": \"0929589122\"\n" +
                "     },\n" +
                "     {\n" +
                "      \"type\": \"ISBN_13\",\n" +
                "      \"identifier\": \"9780929589121\"\n" +
                "     }\n" +
                "    ],\n" +
                "    \"readingModes\": {\n" +
                "     \"text\": false,\n" +
                "     \"image\": false\n" +
                "    },\n" +
                "    \"pageCount\": 128,\n" +
                "    \"printType\": \"BOOK\",\n" +
                "    \"categories\": [\n" +
                "     \"Crafts & Hobbies\"\n" +
                "    ],\n" +
                "    \"maturityRating\": \"NOT_MATURE\",\n" +
                "    \"allowAnonLogging\": false,\n" +
                "    \"contentVersion\": \"preview-1.0.0\",\n" +
                "    \"imageLinks\": {\n" +
                "     \"smallThumbnail\": \"http://books.google.com/books/content?id=VZ5IPQAACAAJ&printsec=frontcover&img=1&zoom=5&source=gbs_api\",\n" +
                "     \"thumbnail\": \"http://books.google.com/books/content?id=VZ5IPQAACAAJ&printsec=frontcover&img=1&zoom=1&source=gbs_api\"\n" +
                "    },\n" +
                "    \"language\": \"en\",\n" +
                "    \"previewLink\": \"http://books.google.com/books?id=VZ5IPQAACAAJ&dq=quilting&hl=&cd=10&source=gbs_api\",\n" +
                "    \"infoLink\": \"http://books.google.com/books?id=VZ5IPQAACAAJ&dq=quilting&hl=&source=gbs_api\",\n" +
                "    \"canonicalVolumeLink\": \"https://books.google.com/books/about/Judy_Martin_s_Log_Cabin_Quilt_Book.html?hl=&id=VZ5IPQAACAAJ\"\n" +
                "   },\n" +
                "   \"saleInfo\": {\n" +
                "    \"country\": \"US\",\n" +
                "    \"saleability\": \"NOT_FOR_SALE\",\n" +
                "    \"isEbook\": false\n" +
                "   },\n" +
                "   \"accessInfo\": {\n" +
                "    \"country\": \"US\",\n" +
                "    \"viewability\": \"NO_PAGES\",\n" +
                "    \"embeddable\": false,\n" +
                "    \"publicDomain\": false,\n" +
                "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
                "    \"epub\": {\n" +
                "     \"isAvailable\": false\n" +
                "    },\n" +
                "    \"pdf\": {\n" +
                "     \"isAvailable\": false\n" +
                "    },\n" +
                "    \"webReaderLink\": \"http://play.google.com/books/reader?id=VZ5IPQAACAAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "    \"accessViewStatus\": \"NONE\",\n" +
                "    \"quoteSharingAllowed\": false\n" +
                "   },\n" +
                "   \"searchInfo\": {\n" +
                "    \"textSnippet\": \"This lavishly illustrated volume is Judy Martin&#39;s 19th book on quilting, her 2nd devoted to Log Cabins. She has designed more original patterns than anyone in history.\"\n" +
                "   }\n" +
                "  }\n" +
                " ]\n" +
                "}";

        try {
            JSONObject jsonRoot = new JSONObject(placeholderJson);
            JSONArray jsonItems = jsonRoot.getJSONArray("items");

            for(String jsonItem: jsonItems){

            }


        }catch (JSONException e){
            e.printStackTrace();
        }
    }
}
