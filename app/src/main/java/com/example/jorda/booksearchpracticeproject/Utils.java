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

    public static ArrayList<Book> fetchVolumesFromJson(String searchInput){
        String placeholderJson = "{\n" +
                " \"kind\": \"books#volumes\",\n" +
                " \"totalItems\": 3701,\n" +
                " \"items\": [\n" +
                "  {\n" +
                "   \"kind\": \"books#volume\",\n" +
                "   \"id\": \"F9gzDwAAQBAJ\",\n" +
                "   \"etag\": \"2KgB/OwvqkQ\",\n" +
                "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/F9gzDwAAQBAJ\",\n" +
                "   \"volumeInfo\": {\n" +
                "    \"title\": \"The Four\",\n" +
                "    \"subtitle\": \"The Hidden DNA of Amazon, Apple, Facebook, and Google\",\n" +
                "    \"authors\": [\n" +
                "     \"Scott Galloway\"\n" +
                "    ],\n" +
                "    \"publisher\": \"Penguin\",\n" +
                "    \"publishedDate\": \"2017\",\n" +
                "    \"description\": \"In his highly provocative first book, Scott Galloway pulls back the curtain on exactly how Amazon, Apple, Facebook, and Google built their massive empires. While the media spins tales about superior products and designs, and the power of technological innovation, Galloway exposes the truth: none of these four are first movers technologically - they've either copied, stolen, or acquired their ideas. Readers will come away with fresh, game -changing insights about what it takes to win in today's economy. Print run 125,000.\",\n" +
                "    \"industryIdentifiers\": [\n" +
                "     {\n" +
                "      \"type\": \"ISBN_13\",\n" +
                "      \"identifier\": \"9780735213654\"\n" +
                "     },\n" +
                "     {\n" +
                "      \"type\": \"ISBN_10\",\n" +
                "      \"identifier\": \"0735213658\"\n" +
                "     }\n" +
                "    ],\n" +
                "    \"readingModes\": {\n" +
                "     \"text\": false,\n" +
                "     \"image\": false\n" +
                "    },\n" +
                "    \"pageCount\": 310,\n" +
                "    \"printType\": \"BOOK\",\n" +
                "    \"categories\": [\n" +
                "     \"Business & Economics\"\n" +
                "    ],\n" +
                "    \"maturityRating\": \"NOT_MATURE\",\n" +
                "    \"allowAnonLogging\": false,\n" +
                "    \"contentVersion\": \"0.1.0.0.preview.0\",\n" +
                "    \"panelizationSummary\": {\n" +
                "     \"containsEpubBubbles\": false,\n" +
                "     \"containsImageBubbles\": false\n" +
                "    },\n" +
                "    \"imageLinks\": {\n" +
                "     \"smallThumbnail\": \"http://books.google.com/books/content?id=F9gzDwAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "     \"thumbnail\": \"http://books.google.com/books/content?id=F9gzDwAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "    },\n" +
                "    \"language\": \"en\",\n" +
                "    \"previewLink\": \"http://books.google.com/books?id=F9gzDwAAQBAJ&printsec=frontcover&dq=technology&hl=&cd=1&source=gbs_api\",\n" +
                "    \"infoLink\": \"http://books.google.com/books?id=F9gzDwAAQBAJ&dq=technology&hl=&source=gbs_api\",\n" +
                "    \"canonicalVolumeLink\": \"https://books.google.com/books/about/The_Four.html?hl=&id=F9gzDwAAQBAJ\"\n" +
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
                "    \"textToSpeechPermission\": \"ALLOWED_FOR_ACCESSIBILITY\",\n" +
                "    \"epub\": {\n" +
                "     \"isAvailable\": false\n" +
                "    },\n" +
                "    \"pdf\": {\n" +
                "     \"isAvailable\": false\n" +
                "    },\n" +
                "    \"webReaderLink\": \"http://play.google.com/books/reader?id=F9gzDwAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "    \"accessViewStatus\": \"SAMPLE\",\n" +
                "    \"quoteSharingAllowed\": false\n" +
                "   },\n" +
                "   \"searchInfo\": {\n" +
                "    \"textSnippet\": \"While the media spins tales about superior products and designs, and the power of technological innovation, Galloway exposes the truth: none of these four are first movers technologically - they&#39;ve either copied, stolen, or acquired their ...\"\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"books#volume\",\n" +
                "   \"id\": \"chZSDgAAQBAJ\",\n" +
                "   \"etag\": \"m7xl6ZSaFeg\",\n" +
                "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/chZSDgAAQBAJ\",\n" +
                "   \"volumeInfo\": {\n" +
                "    \"title\": \"Technically Wrong: Sexist Apps, Biased Algorithms, and Other Threats of Toxic Tech\",\n" +
                "    \"authors\": [\n" +
                "     \"Sara Wachter-Boettcher\"\n" +
                "    ],\n" +
                "    \"publisher\": \"W. W. Norton & Company\",\n" +
                "    \"publishedDate\": \"2017-10-10\",\n" +
                "    \"description\": \"A revealing look at how tech industry bias and blind spots get baked into digital products—and harm us all. Buying groceries, tracking our health, finding a date: whatever we want to do, odds are that we can now do it online. But few of us ask why all these digital products are designed the way they are. It’s time we change that. Many of the services we rely on are full of oversights, biases, and downright ethical nightmares: Chatbots that harass women. Signup forms that fail anyone who’s not straight. Social media sites that send peppy messages about dead relatives. Algorithms that put more black people behind bars. Sara Wachter-Boettcher takes an unflinching look at the values, processes, and assumptions that lead to these and other problems. Technically Wrong demystifies the tech industry, leaving those of us on the other side of the screen better prepared to make informed choices about the services we use—and demand more from the companies behind them.\",\n" +
                "    \"industryIdentifiers\": [\n" +
                "     {\n" +
                "      \"type\": \"ISBN_13\",\n" +
                "      \"identifier\": \"9780393634648\"\n" +
                "     },\n" +
                "     {\n" +
                "      \"type\": \"ISBN_10\",\n" +
                "      \"identifier\": \"0393634647\"\n" +
                "     }\n" +
                "    ],\n" +
                "    \"readingModes\": {\n" +
                "     \"text\": true,\n" +
                "     \"image\": false\n" +
                "    },\n" +
                "    \"pageCount\": 240,\n" +
                "    \"printType\": \"BOOK\",\n" +
                "    \"categories\": [\n" +
                "     \"Computers\"\n" +
                "    ],\n" +
                "    \"maturityRating\": \"NOT_MATURE\",\n" +
                "    \"allowAnonLogging\": true,\n" +
                "    \"contentVersion\": \"1.5.4.0.preview.2\",\n" +
                "    \"panelizationSummary\": {\n" +
                "     \"containsEpubBubbles\": false,\n" +
                "     \"containsImageBubbles\": false\n" +
                "    },\n" +
                "    \"imageLinks\": {\n" +
                "     \"smallThumbnail\": \"http://books.google.com/books/content?id=chZSDgAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
                "     \"thumbnail\": \"http://books.google.com/books/content?id=chZSDgAAQBAJ&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
                "    },\n" +
                "    \"language\": \"en\",\n" +
                "    \"previewLink\": \"http://books.google.com/books?id=chZSDgAAQBAJ&printsec=frontcover&dq=technology&hl=&cd=2&source=gbs_api\",\n" +
                "    \"infoLink\": \"https://play.google.com/store/books/details?id=chZSDgAAQBAJ&source=gbs_api\",\n" +
                "    \"canonicalVolumeLink\": \"https://market.android.com/details?id=book-chZSDgAAQBAJ\"\n" +
                "   },\n" +
                "   \"saleInfo\": {\n" +
                "    \"country\": \"US\",\n" +
                "    \"saleability\": \"FOR_SALE\",\n" +
                "    \"isEbook\": true,\n" +
                "    \"listPrice\": {\n" +
                "     \"amount\": 20.98,\n" +
                "     \"currencyCode\": \"USD\"\n" +
                "    },\n" +
                "    \"retailPrice\": {\n" +
                "     \"amount\": 9.99,\n" +
                "     \"currencyCode\": \"USD\"\n" +
                "    },\n" +
                "    \"buyLink\": \"https://play.google.com/store/books/details?id=chZSDgAAQBAJ&rdid=book-chZSDgAAQBAJ&rdot=1&source=gbs_api\",\n" +
                "    \"offers\": [\n" +
                "     {\n" +
                "      \"finskyOfferType\": 1,\n" +
                "      \"listPrice\": {\n" +
                "       \"amountInMicros\": 2.098E7,\n" +
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
                "     \"acsTokenLink\": \"http://books.google.com/books/download/Technically_Wrong_Sexist_Apps_Biased_Alg-sample-epub.acsm?id=chZSDgAAQBAJ&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api\"\n" +
                "    },\n" +
                "    \"pdf\": {\n" +
                "     \"isAvailable\": false\n" +
                "    },\n" +
                "    \"webReaderLink\": \"http://play.google.com/books/reader?id=chZSDgAAQBAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
                "    \"accessViewStatus\": \"SAMPLE\",\n" +
                "    \"quoteSharingAllowed\": false\n" +
                "   },\n" +
                "   \"searchInfo\": {\n" +
                "    \"textSnippet\": \"Algorithms that put more black people behind bars. Sara Wachter-Boettcher takes an unflinching look at the values, processes, and assumptions that lead to these and other problems.\"\n" +
                "   }\n" +
                "  }\n" +
                " ]\n" +
                "}";


        ArrayList<Book> books = new ArrayList<>();
        try {
            // Get JSON root
            JSONObject jsonRoot = new JSONObject(placeholderJson);

            // Items JSON array
            JSONArray jsonItems = jsonRoot.getJSONArray("items");


            String title;
            String author;
            double price;
            for(int i=0; i<jsonItems.length(); i++){
                // Book volume
                JSONObject volume = jsonItems.getJSONObject(i);

                // Volume info
                JSONObject volumeInfo = volume.getJSONObject("volumeInfo");
                title = volumeInfo.getString("title");
                author = volumeInfo.getJSONArray("authors").getString(0);
                books.add(new Book(title, author, 34.99));
            }
        }catch (JSONException e){
            e.printStackTrace();
        }


        // Return ArrayList of books
        return books;
    }
}
