/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Generic component type belonging to a POI (Point of Interaction) Terminal.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#mmSoft
 * POIComponentTypeCode.mmSoft}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#mmEMVKernel
 * POIComponentTypeCode.mmEMVKernel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#mmEMVLevel1
 * POIComponentTypeCode.mmEMVLevel1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#mmMerchantInterface
 * POIComponentTypeCode.mmMerchantInterface}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#mmCardholderInterface
 * POIComponentTypeCode.mmCardholderInterface}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#mmSecureModule
 * POIComponentTypeCode.mmSecureModule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#mmPINEntryDevice
 * POIComponentTypeCode.mmPINEntryDevice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#mmAcquirerParameters
 * POIComponentTypeCode.mmAcquirerParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#mmMerchantParameters
 * POIComponentTypeCode.mmMerchantParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#mmVendorParameters
 * POIComponentTypeCode.mmVendorParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#mmAcquirerProtocolParameters
 * POIComponentTypeCode.mmAcquirerProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#mmApplicationParameters
 * POIComponentTypeCode.mmApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#mmDevice
 * POIComponentTypeCode.mmDevice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#mmDriver
 * POIComponentTypeCode.mmDriver}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#mmMiddleware
 * POIComponentTypeCode.mmMiddleware}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#mmOperatingSystem
 * POIComponentTypeCode.mmOperatingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#mmPaymentApplication
 * POIComponentTypeCode.mmPaymentApplication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#mmSecurityParameters
 * POIComponentTypeCode.mmSecurityParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#mmServer
 * POIComponentTypeCode.mmServer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#mmTerminal
 * POIComponentTypeCode.mmTerminal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#mmTerminalParameters
 * POIComponentTypeCode.mmTerminalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#mmCertificateParameters
 * POIComponentTypeCode.mmCertificateParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#mmTMSProtocolParameters
 * POIComponentTypeCode.mmTMSProtocolParameters}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.POIComponentType1Code
 * POIComponentType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SOFT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "POIComponentTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Generic component type belonging to a POI (Point of Interaction) Terminal."</li>
 * </ul>
 */
public class POIComponentTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payment or other software application.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOFT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Soft"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment or other software application."</li>
	 * </ul>
	 */
	public static final MMCode mmSoft = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Soft";
			definition = "Payment or other software application.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "SOFT";
		}
	};
	/**
	 * EMV application kernel (EMV is the chip card specifications initially
	 * defined by Eurocard, Mastercard and Visa).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMVK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMVKernel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EMV application kernel  (EMV is the chip card specifications initially defined by Eurocard, Mastercard and Visa)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEMVKernel = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EMVKernel";
			definition = "EMV application kernel  (EMV is the chip card specifications initially defined by Eurocard, Mastercard and Visa).";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "EMVK";
		}
	};
	/**
	 * EMV physical interface (EMV is the chip card specifications initially
	 * defined by Eurocard, Mastercard and Visa).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMVO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMVLevel1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EMV physical interface (EMV is the chip card specifications initially defined by Eurocard, Mastercard and Visa)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEMVLevel1 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EMVLevel1";
			definition = "EMV physical interface (EMV is the chip card specifications initially defined by Eurocard, Mastercard and Visa).";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "EMVO";
		}
	};
	/**
	 * Merchant interface.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MRIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantInterface"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Merchant interface."</li>
	 * </ul>
	 */
	public static final MMCode mmMerchantInterface = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MerchantInterface";
			definition = "Merchant interface.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "MRIT";
		}
	};
	/**
	 * Cardholder Interface.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderInterface"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cardholder Interface."</li>
	 * </ul>
	 */
	public static final MMCode mmCardholderInterface = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardholderInterface";
			definition = "Cardholder Interface.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "CHIT";
		}
	};
	/**
	 * Security module.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecureModule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security module."</li>
	 * </ul>
	 */
	public static final MMCode mmSecureModule = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecureModule";
			definition = "Security module.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "SECM";
		}
	};
	/**
	 * Personal identification number (or PIN) entry device (PED).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEDV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINEntryDevice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Personal identification number (or PIN) entry device (PED)."</li>
	 * </ul>
	 */
	public static final MMCode mmPINEntryDevice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PINEntryDevice";
			definition = "Personal identification number (or PIN) entry device (PED).";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "PEDV";
		}
	};
	/**
	 * Acquirer specific configuration parameters for the point of interaction
	 * (POI) system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AQPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acquirer specific configuration parameters for the point of interaction (POI) system."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAcquirerParameters = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcquirerParameters";
			definition = "Acquirer specific configuration parameters for the point of interaction (POI) system.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "AQPR";
		}
	};
	/**
	 * Merchant configuration parameters for the point of interaction (POI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MRPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Merchant configuration parameters for the point of interaction (POI)."</li>
	 * </ul>
	 */
	public static final MMCode mmMerchantParameters = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MerchantParameters";
			definition = "Merchant configuration parameters for the point of interaction (POI).";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "MRPR";
		}
	};
	/**
	 * Point of interaction parameters defined by the manufacturer for instance
	 * the PIN verification capabilities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VDPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point of interaction parameters defined by the manufacturer for instance the PIN verification capabilities."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmVendorParameters = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VendorParameters";
			definition = "Point of interaction parameters defined by the manufacturer for instance the PIN verification capabilities.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "VDPR";
		}
	};
	/**
	 * Parameters for acquirer interface of the point of interaction, including
	 * acquirer host configuration parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AQPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerProtocolParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters for acquirer interface of the point of interaction, including acquirer host configuration parameters."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAcquirerProtocolParameters = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcquirerProtocolParameters";
			definition = "Parameters for acquirer interface of the point of interaction, including acquirer host configuration parameters.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "AQPP";
		}
	};
	/**
	 * Parameters of a payment application running on the point of interaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters of a payment application running on the point of interaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmApplicationParameters = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApplicationParameters";
			definition = "Parameters of a payment application running on the point of interaction.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "APPR";
		}
	};
	/**
	 * Device sub-component of a component of the point of interaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVCE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Device"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Device sub-component of a component of the point of interaction."</li>
	 * </ul>
	 */
	public static final MMCode mmDevice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Device";
			definition = "Device sub-component of a component of the point of interaction.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "DVCE";
		}
	};
	/**
	 * Driver module of the point of interaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRVR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Driver"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Driver module of the point of interaction."</li>
	 * </ul>
	 */
	public static final MMCode mmDriver = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Driver";
			definition = "Driver module of the point of interaction.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "DRVR";
		}
	};
	/**
	 * Software module of the point of interaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MDWR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Middleware"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Software module of the point of interaction."</li>
	 * </ul>
	 */
	public static final MMCode mmMiddleware = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Middleware";
			definition = "Software module of the point of interaction.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "MDWR";
		}
	};
	/**
	 * Software that manages hardware to provide common services to the
	 * applications.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperatingSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Software that manages hardware to provide common services to the applications."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOperatingSystem = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OperatingSystem";
			definition = "Software that manages hardware to provide common services to the applications.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "OPST";
		}
	};
	/**
	 * Payment application software.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentApplication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment application software."</li>
	 * </ul>
	 */
	public static final MMCode mmPaymentApplication = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentApplication";
			definition = "Payment application software.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "APLI";
		}
	};
	/**
	 * Security parameters of the point of interaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security parameters of the point of interaction."</li>
	 * </ul>
	 */
	public static final MMCode mmSecurityParameters = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityParameters";
			definition = "Security parameters of the point of interaction.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "SCPR";
		}
	};
	/**
	 * Payment server of a point of interaction system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SERV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Server"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment server of a point of interaction system."</li>
	 * </ul>
	 */
	public static final MMCode mmServer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Server";
			definition = "Payment server of a point of interaction system.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "SERV";
		}
	};
	/**
	 * Payment terminal point of interaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TERM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Terminal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment terminal point of interaction."</li>
	 * </ul>
	 */
	public static final MMCode mmTerminal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Terminal";
			definition = "Payment terminal point of interaction.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "TERM";
		}
	};
	/**
	 * Manufacturer configuration parameters of the point of interaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TLPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Manufacturer configuration parameters of the point of interaction."</li>
	 * </ul>
	 */
	public static final MMCode mmTerminalParameters = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminalParameters";
			definition = "Manufacturer configuration parameters of the point of interaction.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "TLPR";
		}
	};
	/**
	 * Certificate provided by a terminal manager.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRTF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate provided by a terminal manager."</li>
	 * </ul>
	 */
	public static final MMCode mmCertificateParameters = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateParameters";
			definition = "Certificate provided by a terminal manager.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "CRTF";
		}
	};
	/**
	 * Configuration parameters for the TMS protocol.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode
	 * POIComponentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TMSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMSProtocolParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration parameters for the TMS protocol."</li>
	 * </ul>
	 */
	public static final MMCode mmTMSProtocolParameters = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocolParameters";
			definition = "Configuration parameters for the TMS protocol.";
			owner_lazy = () -> POIComponentTypeCode.mmObject();
			codeName = "TMSP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("SOFT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "POIComponentTypeCode";
				definition = "Generic component type belonging to a POI (Point of Interaction) Terminal.";
				code_lazy = () -> Arrays.asList(POIComponentTypeCode.mmSoft, POIComponentTypeCode.mmEMVKernel, POIComponentTypeCode.mmEMVLevel1, POIComponentTypeCode.mmMerchantInterface, POIComponentTypeCode.mmCardholderInterface,
						POIComponentTypeCode.mmSecureModule, POIComponentTypeCode.mmPINEntryDevice, POIComponentTypeCode.mmAcquirerParameters, POIComponentTypeCode.mmMerchantParameters, POIComponentTypeCode.mmVendorParameters,
						POIComponentTypeCode.mmAcquirerProtocolParameters, POIComponentTypeCode.mmApplicationParameters, POIComponentTypeCode.mmDevice, POIComponentTypeCode.mmDriver, POIComponentTypeCode.mmMiddleware,
						POIComponentTypeCode.mmOperatingSystem, POIComponentTypeCode.mmPaymentApplication, POIComponentTypeCode.mmSecurityParameters, POIComponentTypeCode.mmServer, POIComponentTypeCode.mmTerminal,
						POIComponentTypeCode.mmTerminalParameters, POIComponentTypeCode.mmCertificateParameters, POIComponentTypeCode.mmTMSProtocolParameters);
				derivation_lazy = () -> Arrays.asList(POIComponentType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}