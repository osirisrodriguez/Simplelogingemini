# Login Screen Implementation Plan

Build a professional-looking login screen using Kotlin, XML, and ViewBinding, following the design provided in the reference image.

## User Review Required

> [!NOTE]
> The image shows a LinkedIn icon, but the request asks for an Instagram icon. I will use a generic Instagram-like icon for the second social login.

## Proposed Changes

### Resources

#### [NEW] [bg_gradient.xml](file:///C:/Users/osiri/OneDrive/Escritorio/Programacion en Aplicaciones/Nueva carpeta (3)/app/src/main/res/drawable/bg_gradient.xml)
Creates a vertical blue-to-red gradient background as seen in the reference image.

#### [NEW] [rounded_edittext.xml](file:///C:/Users/osiri/OneDrive/Escritorio/Programacion en Aplicaciones/Nueva carpeta (3)/app/src/main/res/drawable/rounded_edittext.xml)
Defines a transparent background with white rounded borders for the input fields.

#### [NEW] [rounded_button.xml](file:///C:/Users/osiri/OneDrive/Escritorio/Programacion en Aplicaciones/Nueva carpeta (3)/app/src/main/res/drawable/rounded_button.xml)
Defines a white background with fully rounded corners for the login button.

#### [NEW] [ic_user.xml](file:///C:/Users/osiri/OneDrive/Escritorio/Programacion en Aplicaciones/Nueva carpeta (3)/app/src/main/res/drawable/ic_user.xml)
Vector asset for the user profile icon.

#### [NEW] [ic_facebook.xml](file:///C:/Users/osiri/OneDrive/Escritorio/Programacion en Aplicaciones/Nueva carpeta (3)/app/src/main/res/drawable/ic_facebook.xml)
Vector asset for the Facebook social icon.

#### [NEW] [ic_instagram.xml](file:///C:/Users/osiri/OneDrive/Escritorio/Programacion en Aplicaciones/Nueva carpeta (3)/app/src/main/res/drawable/ic_instagram.xml)
Vector asset for the Instagram social icon.

### Layout

#### [NEW] [activity_main.xml](file:///C:/Users/osiri/OneDrive/Escritorio/Programacion en Aplicaciones/Nueva carpeta (3)/app/src/main/res/layout/activity_main.xml)
The main layout using `ConstraintLayout` to position:
- User icon at the top.
- Username and Password EditTexts with rounded styles.
- "Login" button with rounded style.
- "Social login" label.
- Facebook and Instagram icons at the bottom.

### Logic

#### [MODIFY] [MainActivity.kt](file:///C:/Users/osiri/OneDrive/Escritorio/Programacion en Aplicaciones/Nueva carpeta (3)/app/src/main/java/com/example/simplelogingemini/MainActivity.kt)
- Migrate from `ComponentActivity` (Compose) to `AppCompatActivity` (XML).
- Implement ViewBinding to access layout components.
- Add validation logic for input fields.
- Show a Toast message when the "Login" button is clicked and fields are valid.

## Verification Plan

### Manual Verification
1.  Deploy the app to an Android device/emulator.
2.  Verify the UI matches the reference image (gradient, rounded corners, icons).
3.  Test validation: Click "Login" with empty fields and ensure it handles it (e.g., shows error or does nothing).
4.  Test success: Enter credentials and click "Login" to see the "ingresaste las credenciales correctas" Toast.
