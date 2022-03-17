package com.example.songr.Controllers;

import com.example.songr.Model.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AlbumController {
    @GetMapping("/albums")
    public String albums(Model model) {
        Album a = new Album("My way", "frank sinatra", 10, 454545, "https://wikiimg.tojsiabtv.com/wikipedia/en/thumb/b/b2/My_Way_-_Frank_Sinatra.jpg/1280px-My_Way_-_Frank_Sinatra.jpg");
        Album b = new Album("Dance Me to the End of Love", "leonard cohen", 10, 454545, "https://images.genius.com/8c656d9d4459e272aad62ec1a38a78bc.600x600x1.jpg");
        Album c = new Album("Mambo Italiano", "Dean Martin", 10, 454545, "https://i.kfs.io/album/global/146838483,0v1/fit/500x500.jpg");
            Album[] albums = {a, b, c};
            model.addAttribute("albums", albums);
        return "albums";
    }

}
