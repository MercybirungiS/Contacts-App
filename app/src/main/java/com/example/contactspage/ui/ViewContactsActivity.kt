package com.example.contactspage.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModel
import com.example.contactspage.R
import com.example.contactspage.databinding.ActivityViewContactsBinding
import com.squareup.picasso.Picasso
import java.io.File


class ViewContactsActivity : AppCompatActivity() {
//    val contactsViewModel:ViewModel by ViewModel()
    var contactid=0
    lateinit var  binding:ActivityViewContactsBinding
lateinit var tvName2:TextView
lateinit var tvPhoneNo2:TextView
lateinit var tvEmail2:TextView
lateinit var imgPerson2:ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_contacts)
        var intent =intent
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).putExtra(MediaStore.EXTRA_OUTPUT)
        

        tvName2=findViewById(R.id.tvName2)
        tvPhoneNo2=findViewById(R.id.tvPhone2)
        tvEmail2=findViewById(R.id.tvEmail2)
        imgPerson2=findViewById(R.id.imgPerson2)


        var nameintent=intent.getStringExtra("name")
        tvName2.text=nameintent
        var phoneIntent=intent.getStringExtra("phoneNumber")
        tvPhoneNo2.text=phoneIntent
        var emailIntent=intent.getStringExtra("email")
        tvEmail2.text=emailIntent
       var imageIntent=intent.getStringExtra("image").toString()
        Picasso.get().load(imageIntent).into(imgPerson2)



//    }
//    fun getPhotoFile(filename:String) : File {
//        val storageDirectory
//
//    }
//
//    }
//
//private fun Intent.putExtra(extraOutput: String) {
//
//}
//override fun onRequestPermissionsResult(
//requestCode: Int,
//permissions: Array<out String>,
//grantResults: IntArray
//) {
//super.onRequestPermissionsResult(requestCode, permissions,
//grantResults)
//when (requestCode) {
//111 -> {
//if (grantResults.isNotEmpty() && grantResults[0] ==
//PackageManager.PERMISSION_GRANTED) {
//pickImageFromGallery()
//} else {
//Toast.makeText(baseContext, "Permission denied", Toast.
//LENGTH_LONG)
//}
//}
//}
//}






