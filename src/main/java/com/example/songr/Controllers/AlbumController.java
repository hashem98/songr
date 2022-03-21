package com.example.songr.Controllers;

import com.example.songr.Model.Album;
import com.example.songr.Repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;


@Controller
public class AlbumController {
    @Autowired
    private AlbumRepository albumRepository;
    /**
     *  for Lab11
     */

//    @GetMapping("/albums")
//    public String albums(Model model) {
//        Album a = new Album("My way", "frank sinatra", 10, 454545, "https://wikiimg.tojsiabtv.com/wikipedia/en/thumb/b/b2/My_Way_-_Frank_Sinatra.jpg/1280px-My_Way_-_Frank_Sinatra.jpg");
//        Album b = new Album("Dance Me to the End of Love", "leonard cohen", 10, 454545, "https://images.genius.com/8c656d9d4459e272aad62ec1a38a78bc.600x600x1.jpg");
//        Album c = new Album("Mambo Italiano", "Dean Martin", 10, 454545, "https://i.kfs.io/album/global/146838483,0v1/fit/500x500.jpg");
//            Album[] albums = {a, b, c};
//            model.addAttribute("albums", albums);
//        return "albums";
//    }
@GetMapping("/albums")
public String albums(Model model){


    List<Album> albums = albumRepository.findAll();
    model.addAttribute("albums", albums);
    return "albums";
}

    @PostMapping("/add/album")
    public RedirectView postAlbum(@RequestParam String title,
                                  @RequestParam String artist,
                                  @RequestParam int songCount,
                                  @RequestParam float length,
                                  @RequestParam String imageUrl
    ){
        Album albums = albumRepository.save(new Album(title, artist, songCount, length, imageUrl));
        return new RedirectView("/albums");
    }



    @GetMapping("albums/{id}")
    public ResponseEntity<Album> getOneAlbum(@PathVariable Long id){
        Album returnedAlbum = albumRepository.findById(id).orElseThrow();
        return new ResponseEntity<>(returnedAlbum, HttpStatus.OK);
    }


}
