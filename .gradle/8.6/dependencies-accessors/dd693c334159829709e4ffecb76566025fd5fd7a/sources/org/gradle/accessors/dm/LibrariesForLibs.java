package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the {@code libs} extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AccompanistLibraryAccessors laccForAccompanistLibraryAccessors = new AccompanistLibraryAccessors(owner);
    private final ActivityLibraryAccessors laccForActivityLibraryAccessors = new ActivityLibraryAccessors(owner);
    private final ComposeLibraryAccessors laccForComposeLibraryAccessors = new ComposeLibraryAccessors(owner);
    private final CoreLibraryAccessors laccForCoreLibraryAccessors = new CoreLibraryAccessors(owner);
    private final CoroutinesLibraryAccessors laccForCoroutinesLibraryAccessors = new CoroutinesLibraryAccessors(owner);
    private final DateLibraryAccessors laccForDateLibraryAccessors = new DateLibraryAccessors(owner);
    private final DesugarLibraryAccessors laccForDesugarLibraryAccessors = new DesugarLibraryAccessors(owner);
    private final EspressoLibraryAccessors laccForEspressoLibraryAccessors = new EspressoLibraryAccessors(owner);
    private final FirebaseLibraryAccessors laccForFirebaseLibraryAccessors = new FirebaseLibraryAccessors(owner);
    private final HiltLibraryAccessors laccForHiltLibraryAccessors = new HiltLibraryAccessors(owner);
    private final JunitLibraryAccessors laccForJunitLibraryAccessors = new JunitLibraryAccessors(owner);
    private final KotlinLibraryAccessors laccForKotlinLibraryAccessors = new KotlinLibraryAccessors(owner);
    private final LibraryLibraryAccessors laccForLibraryLibraryAccessors = new LibraryLibraryAccessors(owner);
    private final LifecycleLibraryAccessors laccForLifecycleLibraryAccessors = new LifecycleLibraryAccessors(owner);
    private final Material3LibraryAccessors laccForMaterial3LibraryAccessors = new Material3LibraryAccessors(owner);
    private final MessageLibraryAccessors laccForMessageLibraryAccessors = new MessageLibraryAccessors(owner);
    private final NavigationLibraryAccessors laccForNavigationLibraryAccessors = new NavigationLibraryAccessors(owner);
    private final OneLibraryAccessors laccForOneLibraryAccessors = new OneLibraryAccessors(owner);
    private final RealmLibraryAccessors laccForRealmLibraryAccessors = new RealmLibraryAccessors(owner);
    private final RoomLibraryAccessors laccForRoomLibraryAccessors = new RoomLibraryAccessors(owner);
    private final RuntimeLibraryAccessors laccForRuntimeLibraryAccessors = new RuntimeLibraryAccessors(owner);
    private final SplashLibraryAccessors laccForSplashLibraryAccessors = new SplashLibraryAccessors(owner);
    private final TimeLibraryAccessors laccForTimeLibraryAccessors = new TimeLibraryAccessors(owner);
    private final UiLibraryAccessors laccForUiLibraryAccessors = new UiLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Dependency provider for <b>coil</b> with <b>io.coil-kt:coil-compose</b> coordinates and
     * with version reference <b>coil</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getCoil() {
        return create("coil");
    }

    /**
     * Group of libraries at <b>accompanist</b>
     */
    public AccompanistLibraryAccessors getAccompanist() {
        return laccForAccompanistLibraryAccessors;
    }

    /**
     * Group of libraries at <b>activity</b>
     */
    public ActivityLibraryAccessors getActivity() {
        return laccForActivityLibraryAccessors;
    }

    /**
     * Group of libraries at <b>compose</b>
     */
    public ComposeLibraryAccessors getCompose() {
        return laccForComposeLibraryAccessors;
    }

    /**
     * Group of libraries at <b>core</b>
     */
    public CoreLibraryAccessors getCore() {
        return laccForCoreLibraryAccessors;
    }

    /**
     * Group of libraries at <b>coroutines</b>
     */
    public CoroutinesLibraryAccessors getCoroutines() {
        return laccForCoroutinesLibraryAccessors;
    }

    /**
     * Group of libraries at <b>date</b>
     */
    public DateLibraryAccessors getDate() {
        return laccForDateLibraryAccessors;
    }

    /**
     * Group of libraries at <b>desugar</b>
     */
    public DesugarLibraryAccessors getDesugar() {
        return laccForDesugarLibraryAccessors;
    }

    /**
     * Group of libraries at <b>espresso</b>
     */
    public EspressoLibraryAccessors getEspresso() {
        return laccForEspressoLibraryAccessors;
    }

    /**
     * Group of libraries at <b>firebase</b>
     */
    public FirebaseLibraryAccessors getFirebase() {
        return laccForFirebaseLibraryAccessors;
    }

    /**
     * Group of libraries at <b>hilt</b>
     */
    public HiltLibraryAccessors getHilt() {
        return laccForHiltLibraryAccessors;
    }

    /**
     * Group of libraries at <b>junit</b>
     */
    public JunitLibraryAccessors getJunit() {
        return laccForJunitLibraryAccessors;
    }

    /**
     * Group of libraries at <b>kotlin</b>
     */
    public KotlinLibraryAccessors getKotlin() {
        return laccForKotlinLibraryAccessors;
    }

    /**
     * Group of libraries at <b>library</b>
     */
    public LibraryLibraryAccessors getLibrary() {
        return laccForLibraryLibraryAccessors;
    }

    /**
     * Group of libraries at <b>lifecycle</b>
     */
    public LifecycleLibraryAccessors getLifecycle() {
        return laccForLifecycleLibraryAccessors;
    }

    /**
     * Group of libraries at <b>material3</b>
     */
    public Material3LibraryAccessors getMaterial3() {
        return laccForMaterial3LibraryAccessors;
    }

    /**
     * Group of libraries at <b>message</b>
     */
    public MessageLibraryAccessors getMessage() {
        return laccForMessageLibraryAccessors;
    }

    /**
     * Group of libraries at <b>navigation</b>
     */
    public NavigationLibraryAccessors getNavigation() {
        return laccForNavigationLibraryAccessors;
    }

    /**
     * Group of libraries at <b>one</b>
     */
    public OneLibraryAccessors getOne() {
        return laccForOneLibraryAccessors;
    }

    /**
     * Group of libraries at <b>realm</b>
     */
    public RealmLibraryAccessors getRealm() {
        return laccForRealmLibraryAccessors;
    }

    /**
     * Group of libraries at <b>room</b>
     */
    public RoomLibraryAccessors getRoom() {
        return laccForRoomLibraryAccessors;
    }

    /**
     * Group of libraries at <b>runtime</b>
     */
    public RuntimeLibraryAccessors getRuntime() {
        return laccForRuntimeLibraryAccessors;
    }

    /**
     * Group of libraries at <b>splash</b>
     */
    public SplashLibraryAccessors getSplash() {
        return laccForSplashLibraryAccessors;
    }

    /**
     * Group of libraries at <b>time</b>
     */
    public TimeLibraryAccessors getTime() {
        return laccForTimeLibraryAccessors;
    }

    /**
     * Group of libraries at <b>ui</b>
     */
    public UiLibraryAccessors getUi() {
        return laccForUiLibraryAccessors;
    }

    /**
     * Group of versions at <b>versions</b>
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Group of bundles at <b>bundles</b>
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Group of plugins at <b>plugins</b>
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class AccompanistLibraryAccessors extends SubDependencyFactory {

        public AccompanistLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>pager</b> with <b>com.google.accompanist:accompanist-pager</b> coordinates and
         * with version reference <b>accompanist</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPager() {
            return create("accompanist.pager");
        }

    }

    public static class ActivityLibraryAccessors extends SubDependencyFactory {
        private final ActivityComposeLibraryAccessors laccForActivityComposeLibraryAccessors = new ActivityComposeLibraryAccessors(owner);

        public ActivityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>activity.compose</b>
         */
        public ActivityComposeLibraryAccessors getCompose() {
            return laccForActivityComposeLibraryAccessors;
        }

    }

    public static class ActivityComposeLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ActivityComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>compose</b> with <b>androidx.activity:activity-compose</b> coordinates and
         * with version reference <b>activity.compose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("activity.compose");
        }

        /**
         * Dependency provider for <b>v190</b> with <b>androidx.activity:activity-compose</b> coordinates and
         * with version reference <b>activity.compose.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getV190() {
            return create("activity.compose.v190");
        }

    }

    public static class ComposeLibraryAccessors extends SubDependencyFactory {
        private final ComposeBomLibraryAccessors laccForComposeBomLibraryAccessors = new ComposeBomLibraryAccessors(owner);
        private final ComposeToolingLibraryAccessors laccForComposeToolingLibraryAccessors = new ComposeToolingLibraryAccessors(owner);
        private final ComposeUiLibraryAccessors laccForComposeUiLibraryAccessors = new ComposeUiLibraryAccessors(owner);

        public ComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>compose.bom</b>
         */
        public ComposeBomLibraryAccessors getBom() {
            return laccForComposeBomLibraryAccessors;
        }

        /**
         * Group of libraries at <b>compose.tooling</b>
         */
        public ComposeToolingLibraryAccessors getTooling() {
            return laccForComposeToolingLibraryAccessors;
        }

        /**
         * Group of libraries at <b>compose.ui</b>
         */
        public ComposeUiLibraryAccessors getUi() {
            return laccForComposeUiLibraryAccessors;
        }

    }

    public static class ComposeBomLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComposeBomLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>bom</b> with <b>androidx.compose:compose-bom</b> coordinates and
         * with version reference <b>compose.bom</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("compose.bom");
        }

        /**
         * Dependency provider for <b>v20221000</b> with <b>androidx.compose:compose-bom</b> coordinates and
         * with version reference <b>compose.bom.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getV20221000() {
            return create("compose.bom.v20221000");
        }

    }

    public static class ComposeToolingLibraryAccessors extends SubDependencyFactory {

        public ComposeToolingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>preview</b> with <b>androidx.compose.ui:ui-tooling-preview</b> coordinates and
         * with version reference <b>compose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPreview() {
            return create("compose.tooling.preview");
        }

    }

    public static class ComposeUiLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final ComposeUiTestLibraryAccessors laccForComposeUiTestLibraryAccessors = new ComposeUiTestLibraryAccessors(owner);

        public ComposeUiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>ui</b> with <b>androidx.compose.ui:ui</b> coordinates and
         * with version reference <b>compose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("compose.ui");
        }

        /**
         * Dependency provider for <b>tooling</b> with <b>androidx.compose.ui:ui-tooling</b> coordinates and
         * with version reference <b>compose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTooling() {
            return create("compose.ui.tooling");
        }

        /**
         * Group of libraries at <b>compose.ui.test</b>
         */
        public ComposeUiTestLibraryAccessors getTest() {
            return laccForComposeUiTestLibraryAccessors;
        }

    }

    public static class ComposeUiTestLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComposeUiTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>test</b> with <b>androidx.compose.ui:ui-test-junit4</b> coordinates and
         * with version reference <b>compose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("compose.ui.test");
        }

        /**
         * Dependency provider for <b>manifest</b> with <b>androidx.compose.ui:ui-test-manifest</b> coordinates and
         * with version reference <b>compose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getManifest() {
            return create("compose.ui.test.manifest");
        }

    }

    public static class CoreLibraryAccessors extends SubDependencyFactory {
        private final CoreGoogleLibraryAccessors laccForCoreGoogleLibraryAccessors = new CoreGoogleLibraryAccessors(owner);
        private final CoreKtxLibraryAccessors laccForCoreKtxLibraryAccessors = new CoreKtxLibraryAccessors(owner);
        private final CoreSplashscreenLibraryAccessors laccForCoreSplashscreenLibraryAccessors = new CoreSplashscreenLibraryAccessors(owner);

        public CoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>core.google</b>
         */
        public CoreGoogleLibraryAccessors getGoogle() {
            return laccForCoreGoogleLibraryAccessors;
        }

        /**
         * Group of libraries at <b>core.ktx</b>
         */
        public CoreKtxLibraryAccessors getKtx() {
            return laccForCoreKtxLibraryAccessors;
        }

        /**
         * Group of libraries at <b>core.splashscreen</b>
         */
        public CoreSplashscreenLibraryAccessors getSplashscreen() {
            return laccForCoreSplashscreenLibraryAccessors;
        }

    }

    public static class CoreGoogleLibraryAccessors extends SubDependencyFactory {

        public CoreGoogleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>shortcuts</b> with <b>androidx.core:core-google-shortcuts</b> coordinates and
         * with version reference <b>core.google.shortcuts</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getShortcuts() {
            return create("core.google.shortcuts");
        }

    }

    public static class CoreKtxLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public CoreKtxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>ktx</b> with <b>androidx.core:core-ktx</b> coordinates and
         * with version reference <b>core.ktx</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("core.ktx");
        }

        /**
         * Dependency provider for <b>v1131</b> with <b>androidx.core:core-ktx</b> coordinates and
         * with version reference <b>core.ktx.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getV1131() {
            return create("core.ktx.v1131");
        }

    }

    public static class CoreSplashscreenLibraryAccessors extends SubDependencyFactory {

        public CoreSplashscreenLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>v101</b> with <b>androidx.core:core-splashscreen</b> coordinates and
         * with version reference <b>core.splashscreen</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getV101() {
            return create("core.splashscreen.v101");
        }

    }

    public static class CoroutinesLibraryAccessors extends SubDependencyFactory {

        public CoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.jetbrains.kotlinx:kotlinx-coroutines-core</b> coordinates and
         * with version reference <b>kotlin.coroutines.core</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("coroutines.core");
        }

    }

    public static class DateLibraryAccessors extends SubDependencyFactory {
        private final DateTimeLibraryAccessors laccForDateTimeLibraryAccessors = new DateTimeLibraryAccessors(owner);

        public DateLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>dialog</b> with <b>com.maxkeppeler.sheets-compose-dialogs:calendar</b> coordinates and
         * with version reference <b>date.time.picker</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDialog() {
            return create("date.dialog");
        }

        /**
         * Group of libraries at <b>date.time</b>
         */
        public DateTimeLibraryAccessors getTime() {
            return laccForDateTimeLibraryAccessors;
        }

    }

    public static class DateTimeLibraryAccessors extends SubDependencyFactory {

        public DateTimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>picker</b> with <b>com.maxkeppeler.sheets-compose-dialogs:core</b> coordinates and
         * with version reference <b>date.time.picker</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPicker() {
            return create("date.time.picker");
        }

    }

    public static class DesugarLibraryAccessors extends SubDependencyFactory {
        private final DesugarJdkLibraryAccessors laccForDesugarJdkLibraryAccessors = new DesugarJdkLibraryAccessors(owner);

        public DesugarLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>desugar.jdk</b>
         */
        public DesugarJdkLibraryAccessors getJdk() {
            return laccForDesugarJdkLibraryAccessors;
        }

    }

    public static class DesugarJdkLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final DesugarJdkLibsLibraryAccessors laccForDesugarJdkLibsLibraryAccessors = new DesugarJdkLibsLibraryAccessors(owner);

        public DesugarJdkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jdk</b> with <b>com.android.tools:desugar_jdk_libs</b> coordinates and
         * with version reference <b>desugar</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("desugar.jdk");
        }

        /**
         * Group of libraries at <b>desugar.jdk.libs</b>
         */
        public DesugarJdkLibsLibraryAccessors getLibs() {
            return laccForDesugarJdkLibsLibraryAccessors;
        }

    }

    public static class DesugarJdkLibsLibraryAccessors extends SubDependencyFactory {

        public DesugarJdkLibsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>v204</b> with <b>com.android.tools:desugar_jdk_libs</b> coordinates and
         * with version reference <b>desugar.jdk.libs</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getV204() {
            return create("desugar.jdk.libs.v204");
        }

    }

    public static class EspressoLibraryAccessors extends SubDependencyFactory {

        public EspressoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>androidx.test.espresso:espresso-core</b> coordinates and
         * with version reference <b>espresso</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("espresso.core");
        }

    }

    public static class FirebaseLibraryAccessors extends SubDependencyFactory {
        private final FirebaseAuthLibraryAccessors laccForFirebaseAuthLibraryAccessors = new FirebaseAuthLibraryAccessors(owner);
        private final FirebaseStorageLibraryAccessors laccForFirebaseStorageLibraryAccessors = new FirebaseStorageLibraryAccessors(owner);

        public FirebaseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>firebase.auth</b>
         */
        public FirebaseAuthLibraryAccessors getAuth() {
            return laccForFirebaseAuthLibraryAccessors;
        }

        /**
         * Group of libraries at <b>firebase.storage</b>
         */
        public FirebaseStorageLibraryAccessors getStorage() {
            return laccForFirebaseStorageLibraryAccessors;
        }

    }

    public static class FirebaseAuthLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final FirebaseAuthKtxLibraryAccessors laccForFirebaseAuthKtxLibraryAccessors = new FirebaseAuthKtxLibraryAccessors(owner);

        public FirebaseAuthLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>auth</b> with <b>com.google.firebase:firebase-auth-ktx</b> coordinates and
         * with version reference <b>firebase.auth</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("firebase.auth");
        }

        /**
         * Group of libraries at <b>firebase.auth.ktx</b>
         */
        public FirebaseAuthKtxLibraryAccessors getKtx() {
            return laccForFirebaseAuthKtxLibraryAccessors;
        }

    }

    public static class FirebaseAuthKtxLibraryAccessors extends SubDependencyFactory {

        public FirebaseAuthKtxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>v2300</b> with <b>com.google.firebase:firebase-auth-ktx</b> coordinates and
         * with version reference <b>firebase.auth.ktx</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getV2300() {
            return create("firebase.auth.ktx.v2300");
        }

    }

    public static class FirebaseStorageLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final FirebaseStorageKtxLibraryAccessors laccForFirebaseStorageKtxLibraryAccessors = new FirebaseStorageKtxLibraryAccessors(owner);

        public FirebaseStorageLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>storage</b> with <b>com.google.firebase:firebase-storage-ktx</b> coordinates and
         * with version reference <b>firebase.storage</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("firebase.storage");
        }

        /**
         * Group of libraries at <b>firebase.storage.ktx</b>
         */
        public FirebaseStorageKtxLibraryAccessors getKtx() {
            return laccForFirebaseStorageKtxLibraryAccessors;
        }

    }

    public static class FirebaseStorageKtxLibraryAccessors extends SubDependencyFactory {

        public FirebaseStorageKtxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>v2100</b> with <b>com.google.firebase:firebase-storage-ktx</b> coordinates and
         * with version reference <b>firebase.storage.ktx</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getV2100() {
            return create("firebase.storage.ktx.v2100");
        }

    }

    public static class HiltLibraryAccessors extends SubDependencyFactory {
        private final HiltCompilerLibraryAccessors laccForHiltCompilerLibraryAccessors = new HiltCompilerLibraryAccessors(owner);
        private final HiltNavigationLibraryAccessors laccForHiltNavigationLibraryAccessors = new HiltNavigationLibraryAccessors(owner);

        public HiltLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>android</b> with <b>com.google.dagger:hilt-android</b> coordinates and
         * with version reference <b>dagger.hilt</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAndroid() {
            return create("hilt.android");
        }

        /**
         * Group of libraries at <b>hilt.compiler</b>
         */
        public HiltCompilerLibraryAccessors getCompiler() {
            return laccForHiltCompilerLibraryAccessors;
        }

        /**
         * Group of libraries at <b>hilt.navigation</b>
         */
        public HiltNavigationLibraryAccessors getNavigation() {
            return laccForHiltNavigationLibraryAccessors;
        }

    }

    public static class HiltCompilerLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public HiltCompilerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>compiler</b> with <b>com.google.dagger:hilt-compiler</b> coordinates and
         * with version reference <b>dagger.hilt</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("hilt.compiler");
        }

        /**
         * Dependency provider for <b>v246</b> with <b>com.google.dagger:hilt-compiler</b> coordinates and
         * with version reference <b>hilt.compiler</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getV246() {
            return create("hilt.compiler.v246");
        }

    }

    public static class HiltNavigationLibraryAccessors extends SubDependencyFactory {
        private final HiltNavigationComposeLibraryAccessors laccForHiltNavigationComposeLibraryAccessors = new HiltNavigationComposeLibraryAccessors(owner);

        public HiltNavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>hilt.navigation.compose</b>
         */
        public HiltNavigationComposeLibraryAccessors getCompose() {
            return laccForHiltNavigationComposeLibraryAccessors;
        }

    }

    public static class HiltNavigationComposeLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public HiltNavigationComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>compose</b> with <b>androidx.hilt:hilt-navigation-compose</b> coordinates and
         * with version reference <b>hilt.navigation.compose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("hilt.navigation.compose");
        }

        /**
         * Dependency provider for <b>v120</b> with <b>androidx.hilt:hilt-navigation-compose</b> coordinates and
         * with version reference <b>hilt.navigation.compose.version</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getV120() {
            return create("hilt.navigation.compose.v120");
        }

    }

    public static class JunitLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public JunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>junit</b> with <b>junit:junit</b> coordinates and
         * with version reference <b>junit</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("junit");
        }

        /**
         * Dependency provider for <b>ext</b> with <b>androidx.test.ext:junit</b> coordinates and
         * with version reference <b>junit.ext</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getExt() {
            return create("junit.ext");
        }

    }

    public static class KotlinLibraryAccessors extends SubDependencyFactory {

        public KotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>bom</b> with <b>org.jetbrains.kotlin:kotlin-bom</b> coordinates and
         * with version reference <b>kotlin.bom</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBom() {
            return create("kotlin.bom");
        }

    }

    public static class LibraryLibraryAccessors extends SubDependencyFactory {
        private final LibrarySyncLibraryAccessors laccForLibrarySyncLibraryAccessors = new LibrarySyncLibraryAccessors(owner);

        public LibraryLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>library.sync</b>
         */
        public LibrarySyncLibraryAccessors getSync() {
            return laccForLibrarySyncLibraryAccessors;
        }

    }

    public static class LibrarySyncLibraryAccessors extends SubDependencyFactory {

        public LibrarySyncLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>v180</b> with <b>io.realm.kotlin:library-sync</b> coordinates and
         * with version reference <b>library.sync</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getV180() {
            return create("library.sync.v180");
        }

    }

    public static class LifecycleLibraryAccessors extends SubDependencyFactory {
        private final LifecycleRuntimeLibraryAccessors laccForLifecycleRuntimeLibraryAccessors = new LifecycleRuntimeLibraryAccessors(owner);

        public LifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>lifecycle.runtime</b>
         */
        public LifecycleRuntimeLibraryAccessors getRuntime() {
            return laccForLifecycleRuntimeLibraryAccessors;
        }

    }

    public static class LifecycleRuntimeLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final LifecycleRuntimeComposeLibraryAccessors laccForLifecycleRuntimeComposeLibraryAccessors = new LifecycleRuntimeComposeLibraryAccessors(owner);
        private final LifecycleRuntimeKtxLibraryAccessors laccForLifecycleRuntimeKtxLibraryAccessors = new LifecycleRuntimeKtxLibraryAccessors(owner);

        public LifecycleRuntimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>runtime</b> with <b>androidx.lifecycle:lifecycle-runtime-ktx</b> coordinates and
         * with version reference <b>lifecycle.runtime</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("lifecycle.runtime");
        }

        /**
         * Group of libraries at <b>lifecycle.runtime.compose</b>
         */
        public LifecycleRuntimeComposeLibraryAccessors getCompose() {
            return laccForLifecycleRuntimeComposeLibraryAccessors;
        }

        /**
         * Group of libraries at <b>lifecycle.runtime.ktx</b>
         */
        public LifecycleRuntimeKtxLibraryAccessors getKtx() {
            return laccForLifecycleRuntimeKtxLibraryAccessors;
        }

    }

    public static class LifecycleRuntimeComposeLibraryAccessors extends SubDependencyFactory {

        public LifecycleRuntimeComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>v270</b> with <b>androidx.lifecycle:lifecycle-runtime-compose</b> coordinates and
         * with version reference <b>lifecycle.runtime.compose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getV270() {
            return create("lifecycle.runtime.compose.v270");
        }

    }

    public static class LifecycleRuntimeKtxLibraryAccessors extends SubDependencyFactory {

        public LifecycleRuntimeKtxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>v270</b> with <b>androidx.lifecycle:lifecycle-runtime-ktx</b> coordinates and
         * with version reference <b>lifecycle.runtime.ktx</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getV270() {
            return create("lifecycle.runtime.ktx.v270");
        }

    }

    public static class Material3LibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public Material3LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>material3</b> with <b>androidx.compose.material3:material3</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("material3");
        }

        /**
         * Dependency provider for <b>compose</b> with <b>androidx.compose.material3:material3</b> coordinates and
         * with version reference <b>material3.compose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCompose() {
            return create("material3.compose");
        }

    }

    public static class MessageLibraryAccessors extends SubDependencyFactory {
        private final MessageBarLibraryAccessors laccForMessageBarLibraryAccessors = new MessageBarLibraryAccessors(owner);

        public MessageLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>message.bar</b>
         */
        public MessageBarLibraryAccessors getBar() {
            return laccForMessageBarLibraryAccessors;
        }

    }

    public static class MessageBarLibraryAccessors extends SubDependencyFactory {

        public MessageBarLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>compose</b> with <b>com.github.stevdza-san:MessageBarCompose</b> coordinates and
         * with version reference <b>message.bar.compose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCompose() {
            return create("message.bar.compose");
        }

    }

    public static class NavigationLibraryAccessors extends SubDependencyFactory {

        public NavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>compose</b> with <b>androidx.navigation:navigation-compose</b> coordinates and
         * with version reference <b>compose.navigation</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCompose() {
            return create("navigation.compose");
        }

    }

    public static class OneLibraryAccessors extends SubDependencyFactory {
        private final OneTapLibraryAccessors laccForOneTapLibraryAccessors = new OneTapLibraryAccessors(owner);

        public OneLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>one.tap</b>
         */
        public OneTapLibraryAccessors getTap() {
            return laccForOneTapLibraryAccessors;
        }

    }

    public static class OneTapLibraryAccessors extends SubDependencyFactory {

        public OneTapLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>compose</b> with <b>com.github.stevdza-san:OneTapCompose</b> coordinates and
         * with version reference <b>one.tap.compose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCompose() {
            return create("one.tap.compose");
        }

    }

    public static class RealmLibraryAccessors extends SubDependencyFactory {

        public RealmLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>sync</b> with <b>io.realm.kotlin:library-sync</b> coordinates and
         * with version reference <b>realm</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSync() {
            return create("realm.sync");
        }

    }

    public static class RoomLibraryAccessors extends SubDependencyFactory {
        private final RoomCompilerLibraryAccessors laccForRoomCompilerLibraryAccessors = new RoomCompilerLibraryAccessors(owner);
        private final RoomKtxLibraryAccessors laccForRoomKtxLibraryAccessors = new RoomKtxLibraryAccessors(owner);
        private final RoomRuntimeLibraryAccessors laccForRoomRuntimeLibraryAccessors = new RoomRuntimeLibraryAccessors(owner);

        public RoomLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>room.compiler</b>
         */
        public RoomCompilerLibraryAccessors getCompiler() {
            return laccForRoomCompilerLibraryAccessors;
        }

        /**
         * Group of libraries at <b>room.ktx</b>
         */
        public RoomKtxLibraryAccessors getKtx() {
            return laccForRoomKtxLibraryAccessors;
        }

        /**
         * Group of libraries at <b>room.runtime</b>
         */
        public RoomRuntimeLibraryAccessors getRuntime() {
            return laccForRoomRuntimeLibraryAccessors;
        }

    }

    public static class RoomCompilerLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public RoomCompilerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>compiler</b> with <b>androidx.room:room-compiler</b> coordinates and
         * with version reference <b>room</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("room.compiler");
        }

        /**
         * Dependency provider for <b>v261</b> with <b>androidx.room:room-compiler</b> coordinates and
         * with version reference <b>room.compiler</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getV261() {
            return create("room.compiler.v261");
        }

    }

    public static class RoomKtxLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public RoomKtxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>ktx</b> with <b>androidx.room:room-ktx</b> coordinates and
         * with version reference <b>room</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("room.ktx");
        }

        /**
         * Dependency provider for <b>v261</b> with <b>androidx.room:room-ktx</b> coordinates and
         * with version reference <b>room.ktx</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getV261() {
            return create("room.ktx.v261");
        }

    }

    public static class RoomRuntimeLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public RoomRuntimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>runtime</b> with <b>androidx.room:room-runtime</b> coordinates and
         * with version reference <b>room</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("room.runtime");
        }

        /**
         * Dependency provider for <b>v261</b> with <b>androidx.room:room-runtime</b> coordinates and
         * with version reference <b>room.runtime</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getV261() {
            return create("room.runtime.v261");
        }

    }

    public static class RuntimeLibraryAccessors extends SubDependencyFactory {

        public RuntimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>compose</b> with <b>androidx.lifecycle:lifecycle-runtime-compose</b> coordinates and
         * with version reference <b>runtime.compose</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCompose() {
            return create("runtime.compose");
        }

    }

    public static class SplashLibraryAccessors extends SubDependencyFactory {

        public SplashLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>androidx.core:core-splashscreen</b> coordinates and
         * with version reference <b>splash</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getApi() {
            return create("splash.api");
        }

    }

    public static class TimeLibraryAccessors extends SubDependencyFactory {

        public TimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>dialog</b> with <b>com.maxkeppeler.sheets-compose-dialogs:clock</b> coordinates and
         * with version reference <b>date.time.picker</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDialog() {
            return create("time.dialog");
        }

    }

    public static class UiLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final UiTestLibraryAccessors laccForUiTestLibraryAccessors = new UiTestLibraryAccessors(owner);
        private final UiToolingLibraryAccessors laccForUiToolingLibraryAccessors = new UiToolingLibraryAccessors(owner);

        public UiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>ui</b> with <b>androidx.compose.ui:ui</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("ui");
        }

        /**
         * Dependency provider for <b>graphics</b> with <b>androidx.compose.ui:ui-graphics</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGraphics() {
            return create("ui.graphics");
        }

        /**
         * Group of libraries at <b>ui.test</b>
         */
        public UiTestLibraryAccessors getTest() {
            return laccForUiTestLibraryAccessors;
        }

        /**
         * Group of libraries at <b>ui.tooling</b>
         */
        public UiToolingLibraryAccessors getTooling() {
            return laccForUiToolingLibraryAccessors;
        }

    }

    public static class UiTestLibraryAccessors extends SubDependencyFactory {

        public UiTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>junit4</b> with <b>androidx.compose.ui:ui-test-junit4</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJunit4() {
            return create("ui.test.junit4");
        }

        /**
         * Dependency provider for <b>manifest</b> with <b>androidx.compose.ui:ui-test-manifest</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getManifest() {
            return create("ui.test.manifest");
        }

    }

    public static class UiToolingLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public UiToolingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>tooling</b> with <b>androidx.compose.ui:ui-tooling</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("ui.tooling");
        }

        /**
         * Dependency provider for <b>preview</b> with <b>androidx.compose.ui:ui-tooling-preview</b> coordinates and
         * with <b>no version specified</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPreview() {
            return create("ui.tooling.preview");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final ActivityVersionAccessors vaccForActivityVersionAccessors = new ActivityVersionAccessors(providers, config);
        private final ComposeVersionAccessors vaccForComposeVersionAccessors = new ComposeVersionAccessors(providers, config);
        private final CoreVersionAccessors vaccForCoreVersionAccessors = new CoreVersionAccessors(providers, config);
        private final DaggerVersionAccessors vaccForDaggerVersionAccessors = new DaggerVersionAccessors(providers, config);
        private final DateVersionAccessors vaccForDateVersionAccessors = new DateVersionAccessors(providers, config);
        private final DesugarVersionAccessors vaccForDesugarVersionAccessors = new DesugarVersionAccessors(providers, config);
        private final FirebaseVersionAccessors vaccForFirebaseVersionAccessors = new FirebaseVersionAccessors(providers, config);
        private final HiltVersionAccessors vaccForHiltVersionAccessors = new HiltVersionAccessors(providers, config);
        private final JunitVersionAccessors vaccForJunitVersionAccessors = new JunitVersionAccessors(providers, config);
        private final KotlinVersionAccessors vaccForKotlinVersionAccessors = new KotlinVersionAccessors(providers, config);
        private final LibraryVersionAccessors vaccForLibraryVersionAccessors = new LibraryVersionAccessors(providers, config);
        private final LifecycleVersionAccessors vaccForLifecycleVersionAccessors = new LifecycleVersionAccessors(providers, config);
        private final Material3VersionAccessors vaccForMaterial3VersionAccessors = new Material3VersionAccessors(providers, config);
        private final MessageVersionAccessors vaccForMessageVersionAccessors = new MessageVersionAccessors(providers, config);
        private final OneVersionAccessors vaccForOneVersionAccessors = new OneVersionAccessors(providers, config);
        private final RoomVersionAccessors vaccForRoomVersionAccessors = new RoomVersionAccessors(providers, config);
        private final RuntimeVersionAccessors vaccForRuntimeVersionAccessors = new RuntimeVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>accompanist</b> with value <b>0.27.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getAccompanist() { return getVersion("accompanist"); }

        /**
         * Version alias <b>coil</b> with value <b>2.2.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCoil() { return getVersion("coil"); }

        /**
         * Version alias <b>espresso</b> with value <b>3.5.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getEspresso() { return getVersion("espresso"); }

        /**
         * Version alias <b>realm</b> with value <b>1.7.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getRealm() { return getVersion("realm"); }

        /**
         * Version alias <b>splash</b> with value <b>1.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getSplash() { return getVersion("splash"); }

        /**
         * Group of versions at <b>versions.activity</b>
         */
        public ActivityVersionAccessors getActivity() {
            return vaccForActivityVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.compose</b>
         */
        public ComposeVersionAccessors getCompose() {
            return vaccForComposeVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.core</b>
         */
        public CoreVersionAccessors getCore() {
            return vaccForCoreVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.dagger</b>
         */
        public DaggerVersionAccessors getDagger() {
            return vaccForDaggerVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.date</b>
         */
        public DateVersionAccessors getDate() {
            return vaccForDateVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.desugar</b>
         */
        public DesugarVersionAccessors getDesugar() {
            return vaccForDesugarVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.firebase</b>
         */
        public FirebaseVersionAccessors getFirebase() {
            return vaccForFirebaseVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.hilt</b>
         */
        public HiltVersionAccessors getHilt() {
            return vaccForHiltVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.junit</b>
         */
        public JunitVersionAccessors getJunit() {
            return vaccForJunitVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.kotlin</b>
         */
        public KotlinVersionAccessors getKotlin() {
            return vaccForKotlinVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.library</b>
         */
        public LibraryVersionAccessors getLibrary() {
            return vaccForLibraryVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.lifecycle</b>
         */
        public LifecycleVersionAccessors getLifecycle() {
            return vaccForLifecycleVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.material3</b>
         */
        public Material3VersionAccessors getMaterial3() {
            return vaccForMaterial3VersionAccessors;
        }

        /**
         * Group of versions at <b>versions.message</b>
         */
        public MessageVersionAccessors getMessage() {
            return vaccForMessageVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.one</b>
         */
        public OneVersionAccessors getOne() {
            return vaccForOneVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.room</b>
         */
        public RoomVersionAccessors getRoom() {
            return vaccForRoomVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.runtime</b>
         */
        public RuntimeVersionAccessors getRuntime() {
            return vaccForRuntimeVersionAccessors;
        }

    }

    public static class ActivityVersionAccessors extends VersionFactory  {

        private final ActivityComposeVersionAccessors vaccForActivityComposeVersionAccessors = new ActivityComposeVersionAccessors(providers, config);
        public ActivityVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.activity.compose</b>
         */
        public ActivityComposeVersionAccessors getCompose() {
            return vaccForActivityComposeVersionAccessors;
        }

    }

    public static class ActivityComposeVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public ActivityComposeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>activity.compose</b> with value <b>1.7.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("activity.compose"); }

        /**
         * Version alias <b>activity.compose.version</b> with value <b>1.9.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("activity.compose.version"); }

    }

    public static class ComposeVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        private final ComposeBomVersionAccessors vaccForComposeBomVersionAccessors = new ComposeBomVersionAccessors(providers, config);
        public ComposeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>compose</b> with value <b>1.4.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("compose"); }

        /**
         * Version alias <b>compose.navigation</b> with value <b>2.5.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getNavigation() { return getVersion("compose.navigation"); }

        /**
         * Group of versions at <b>versions.compose.bom</b>
         */
        public ComposeBomVersionAccessors getBom() {
            return vaccForComposeBomVersionAccessors;
        }

    }

    public static class ComposeBomVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public ComposeBomVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>compose.bom</b> with value <b>2024.05.00</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("compose.bom"); }

        /**
         * Version alias <b>compose.bom.version</b> with value <b>2022.10.00</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("compose.bom.version"); }

    }

    public static class CoreVersionAccessors extends VersionFactory  {

        private final CoreGoogleVersionAccessors vaccForCoreGoogleVersionAccessors = new CoreGoogleVersionAccessors(providers, config);
        private final CoreKtxVersionAccessors vaccForCoreKtxVersionAccessors = new CoreKtxVersionAccessors(providers, config);
        public CoreVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>core.splashscreen</b> with value <b>1.0.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getSplashscreen() { return getVersion("core.splashscreen"); }

        /**
         * Group of versions at <b>versions.core.google</b>
         */
        public CoreGoogleVersionAccessors getGoogle() {
            return vaccForCoreGoogleVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.core.ktx</b>
         */
        public CoreKtxVersionAccessors getKtx() {
            return vaccForCoreKtxVersionAccessors;
        }

    }

    public static class CoreGoogleVersionAccessors extends VersionFactory  {

        public CoreGoogleVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>core.google.shortcuts</b> with value <b>1.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getShortcuts() { return getVersion("core.google.shortcuts"); }

    }

    public static class CoreKtxVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public CoreKtxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>core.ktx</b> with value <b>1.10.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("core.ktx"); }

        /**
         * Version alias <b>core.ktx.version</b> with value <b>1.13.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("core.ktx.version"); }

    }

    public static class DaggerVersionAccessors extends VersionFactory  {

        public DaggerVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>dagger.hilt</b> with value <b>2.45</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getHilt() { return getVersion("dagger.hilt"); }

    }

    public static class DateVersionAccessors extends VersionFactory  {

        private final DateTimeVersionAccessors vaccForDateTimeVersionAccessors = new DateTimeVersionAccessors(providers, config);
        public DateVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.date.time</b>
         */
        public DateTimeVersionAccessors getTime() {
            return vaccForDateTimeVersionAccessors;
        }

    }

    public static class DateTimeVersionAccessors extends VersionFactory  {

        public DateTimeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>date.time.picker</b> with value <b>1.0.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getPicker() { return getVersion("date.time.picker"); }

    }

    public static class DesugarVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        private final DesugarJdkVersionAccessors vaccForDesugarJdkVersionAccessors = new DesugarJdkVersionAccessors(providers, config);
        public DesugarVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>desugar</b> with value <b>1.2.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("desugar"); }

        /**
         * Group of versions at <b>versions.desugar.jdk</b>
         */
        public DesugarJdkVersionAccessors getJdk() {
            return vaccForDesugarJdkVersionAccessors;
        }

    }

    public static class DesugarJdkVersionAccessors extends VersionFactory  {

        public DesugarJdkVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>desugar.jdk.libs</b> with value <b>2.0.4</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getLibs() { return getVersion("desugar.jdk.libs"); }

    }

    public static class FirebaseVersionAccessors extends VersionFactory  {

        private final FirebaseAuthVersionAccessors vaccForFirebaseAuthVersionAccessors = new FirebaseAuthVersionAccessors(providers, config);
        private final FirebaseStorageVersionAccessors vaccForFirebaseStorageVersionAccessors = new FirebaseStorageVersionAccessors(providers, config);
        public FirebaseVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.firebase.auth</b>
         */
        public FirebaseAuthVersionAccessors getAuth() {
            return vaccForFirebaseAuthVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.firebase.storage</b>
         */
        public FirebaseStorageVersionAccessors getStorage() {
            return vaccForFirebaseStorageVersionAccessors;
        }

    }

    public static class FirebaseAuthVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public FirebaseAuthVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>firebase.auth</b> with value <b>22.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("firebase.auth"); }

        /**
         * Version alias <b>firebase.auth.ktx</b> with value <b>23.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKtx() { return getVersion("firebase.auth.ktx"); }

    }

    public static class FirebaseStorageVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public FirebaseStorageVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>firebase.storage</b> with value <b>20.2.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("firebase.storage"); }

        /**
         * Version alias <b>firebase.storage.ktx</b> with value <b>21.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKtx() { return getVersion("firebase.storage.ktx"); }

    }

    public static class HiltVersionAccessors extends VersionFactory  {

        private final HiltNavigationVersionAccessors vaccForHiltNavigationVersionAccessors = new HiltNavigationVersionAccessors(providers, config);
        public HiltVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>hilt.compiler</b> with value <b>2.46</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCompiler() { return getVersion("hilt.compiler"); }

        /**
         * Group of versions at <b>versions.hilt.navigation</b>
         */
        public HiltNavigationVersionAccessors getNavigation() {
            return vaccForHiltNavigationVersionAccessors;
        }

    }

    public static class HiltNavigationVersionAccessors extends VersionFactory  {

        private final HiltNavigationComposeVersionAccessors vaccForHiltNavigationComposeVersionAccessors = new HiltNavigationComposeVersionAccessors(providers, config);
        public HiltNavigationVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.hilt.navigation.compose</b>
         */
        public HiltNavigationComposeVersionAccessors getCompose() {
            return vaccForHiltNavigationComposeVersionAccessors;
        }

    }

    public static class HiltNavigationComposeVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public HiltNavigationComposeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>hilt.navigation.compose</b> with value <b>1.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("hilt.navigation.compose"); }

        /**
         * Version alias <b>hilt.navigation.compose.version</b> with value <b>1.2.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getVersion() { return getVersion("hilt.navigation.compose.version"); }

    }

    public static class JunitVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public JunitVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>junit</b> with value <b>4.13.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("junit"); }

        /**
         * Version alias <b>junit.ext</b> with value <b>1.1.5</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getExt() { return getVersion("junit.ext"); }

    }

    public static class KotlinVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        private final KotlinCoroutinesVersionAccessors vaccForKotlinCoroutinesVersionAccessors = new KotlinCoroutinesVersionAccessors(providers, config);
        public KotlinVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>kotlin</b> with value <b>1.8.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("kotlin"); }

        /**
         * Version alias <b>kotlin.bom</b> with value <b>1.8.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getBom() { return getVersion("kotlin.bom"); }

        /**
         * Group of versions at <b>versions.kotlin.coroutines</b>
         */
        public KotlinCoroutinesVersionAccessors getCoroutines() {
            return vaccForKotlinCoroutinesVersionAccessors;
        }

    }

    public static class KotlinCoroutinesVersionAccessors extends VersionFactory  {

        public KotlinCoroutinesVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>kotlin.coroutines.core</b> with value <b>1.6.4</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCore() { return getVersion("kotlin.coroutines.core"); }

    }

    public static class LibraryVersionAccessors extends VersionFactory  {

        public LibraryVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>library.sync</b> with value <b>1.8.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getSync() { return getVersion("library.sync"); }

    }

    public static class LifecycleVersionAccessors extends VersionFactory  {

        private final LifecycleRuntimeVersionAccessors vaccForLifecycleRuntimeVersionAccessors = new LifecycleRuntimeVersionAccessors(providers, config);
        public LifecycleVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.lifecycle.runtime</b>
         */
        public LifecycleRuntimeVersionAccessors getRuntime() {
            return vaccForLifecycleRuntimeVersionAccessors;
        }

    }

    public static class LifecycleRuntimeVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public LifecycleRuntimeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>lifecycle.runtime</b> with value <b>2.6.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("lifecycle.runtime"); }

        /**
         * Version alias <b>lifecycle.runtime.compose</b> with value <b>2.7.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCompose() { return getVersion("lifecycle.runtime.compose"); }

        /**
         * Version alias <b>lifecycle.runtime.ktx</b> with value <b>2.7.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKtx() { return getVersion("lifecycle.runtime.ktx"); }

    }

    public static class Material3VersionAccessors extends VersionFactory  {

        public Material3VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>material3.compose</b> with value <b>1.1.0-beta01</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCompose() { return getVersion("material3.compose"); }

    }

    public static class MessageVersionAccessors extends VersionFactory  {

        private final MessageBarVersionAccessors vaccForMessageBarVersionAccessors = new MessageBarVersionAccessors(providers, config);
        public MessageVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.message.bar</b>
         */
        public MessageBarVersionAccessors getBar() {
            return vaccForMessageBarVersionAccessors;
        }

    }

    public static class MessageBarVersionAccessors extends VersionFactory  {

        public MessageBarVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>message.bar.compose</b> with value <b>1.0.5</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCompose() { return getVersion("message.bar.compose"); }

    }

    public static class OneVersionAccessors extends VersionFactory  {

        private final OneTapVersionAccessors vaccForOneTapVersionAccessors = new OneTapVersionAccessors(providers, config);
        public OneVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.one.tap</b>
         */
        public OneTapVersionAccessors getTap() {
            return vaccForOneTapVersionAccessors;
        }

    }

    public static class OneTapVersionAccessors extends VersionFactory  {

        public OneTapVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>one.tap.compose</b> with value <b>1.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCompose() { return getVersion("one.tap.compose"); }

    }

    public static class RoomVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public RoomVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>room</b> with value <b>2.5.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("room"); }

        /**
         * Version alias <b>room.compiler</b> with value <b>2.6.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCompiler() { return getVersion("room.compiler"); }

        /**
         * Version alias <b>room.ktx</b> with value <b>2.6.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKtx() { return getVersion("room.ktx"); }

        /**
         * Version alias <b>room.runtime</b> with value <b>2.6.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getRuntime() { return getVersion("room.runtime"); }

    }

    public static class RuntimeVersionAccessors extends VersionFactory  {

        public RuntimeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>runtime.compose</b> with value <b>2.6.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCompose() { return getVersion("runtime.compose"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}
