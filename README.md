jika kalian mendapatin error di week ini kalian bisa coba cara dibawah ini:
1. Jika terdapat error di DataStore pada file SettingsStore.kt, bisa import gradle ini
   implementation("androidx.datastore:datastore-core:1.0.0")

2. Jika terdapat error di preference pada file SettingsStore.kt, bisa import gradle ini
   implementation("androidx.datastore:datastore-preferences:1.0.0")

3. no 14 part 1 tambahin ini di manifest bagian <application>

android:name=".PreferenceApplication"

4. no 9 part 2 ganti manifest bagian <application>
android:name=".PreferenceApplication"
menjadi kode dibawah ini
android:name=".SettingsApplication"

5. no 10 part 2 hapus implementation("androidx.datastore:datastore-core:1.0.0")
