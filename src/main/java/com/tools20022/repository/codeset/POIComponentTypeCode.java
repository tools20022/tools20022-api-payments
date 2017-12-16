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
import com.tools20022.repository.codeset.POIComponentTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Generic component type belonging to a POI (Point of Interaction) Terminal.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#Soft
 * POIComponentTypeCode.mmSoft}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#EMVKernel
 * POIComponentTypeCode.mmEMVKernel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#EMVLevel1
 * POIComponentTypeCode.mmEMVLevel1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#MerchantInterface
 * POIComponentTypeCode.mmMerchantInterface}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#CardholderInterface
 * POIComponentTypeCode.mmCardholderInterface}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#SecureModule
 * POIComponentTypeCode.mmSecureModule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#PINEntryDevice
 * POIComponentTypeCode.mmPINEntryDevice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#AcquirerParameters
 * POIComponentTypeCode.mmAcquirerParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#MerchantParameters
 * POIComponentTypeCode.mmMerchantParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#VendorParameters
 * POIComponentTypeCode.mmVendorParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#AcquirerProtocolParameters
 * POIComponentTypeCode.mmAcquirerProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#ApplicationParameters
 * POIComponentTypeCode.mmApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#Device
 * POIComponentTypeCode.mmDevice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#Driver
 * POIComponentTypeCode.mmDriver}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#Middleware
 * POIComponentTypeCode.mmMiddleware}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#OperatingSystem
 * POIComponentTypeCode.mmOperatingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#PaymentApplication
 * POIComponentTypeCode.mmPaymentApplication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#SecurityParameters
 * POIComponentTypeCode.mmSecurityParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#Server
 * POIComponentTypeCode.mmServer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#Terminal
 * POIComponentTypeCode.mmTerminal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#TerminalParameters
 * POIComponentTypeCode.mmTerminalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#CertificateParameters
 * POIComponentTypeCode.mmCertificateParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentTypeCode#TMSProtocolParameters
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class POIComponentTypeCode extends MMCode {

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
	public static final POIComponentTypeCode Soft = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Soft";
			definition = "Payment or other software application.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject();
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
	public static final POIComponentTypeCode EMVKernel = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EMVKernel";
			definition = "EMV application kernel  (EMV is the chip card specifications initially defined by Eurocard, Mastercard and Visa).";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject();
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
	public static final POIComponentTypeCode EMVLevel1 = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EMVLevel1";
			definition = "EMV physical interface (EMV is the chip card specifications initially defined by Eurocard, Mastercard and Visa).";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject();
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
	public static final POIComponentTypeCode MerchantInterface = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MerchantInterface";
			definition = "Merchant interface.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject();
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
	public static final POIComponentTypeCode CardholderInterface = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CardholderInterface";
			definition = "Cardholder Interface.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject();
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
	public static final POIComponentTypeCode SecureModule = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecureModule";
			definition = "Security module.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject();
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
	public static final POIComponentTypeCode PINEntryDevice = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PINEntryDevice";
			definition = "Personal identification number (or PIN) entry device (PED).";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject();
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
	public static final POIComponentTypeCode AcquirerParameters = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcquirerParameters";
			definition = "Acquirer specific configuration parameters for the point of interaction (POI) system.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject();
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
	public static final POIComponentTypeCode MerchantParameters = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MerchantParameters";
			definition = "Merchant configuration parameters for the point of interaction (POI).";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject();
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
	public static final POIComponentTypeCode VendorParameters = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VendorParameters";
			definition = "Point of interaction parameters defined by the manufacturer for instance the PIN verification capabilities.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject();
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
	public static final POIComponentTypeCode AcquirerProtocolParameters = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AcquirerProtocolParameters";
			definition = "Parameters for acquirer interface of the point of interaction, including acquirer host configuration parameters.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject();
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
	public static final POIComponentTypeCode ApplicationParameters = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApplicationParameters";
			definition = "Parameters of a payment application running on the point of interaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject();
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
	public static final POIComponentTypeCode Device = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Device";
			definition = "Device sub-component of a component of the point of interaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject();
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
	public static final POIComponentTypeCode Driver = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Driver";
			definition = "Driver module of the point of interaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject();
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
	public static final POIComponentTypeCode Middleware = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Middleware";
			definition = "Software module of the point of interaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject();
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
	public static final POIComponentTypeCode OperatingSystem = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OperatingSystem";
			definition = "Software that manages hardware to provide common services to the applications.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject();
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
	public static final POIComponentTypeCode PaymentApplication = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentApplication";
			definition = "Payment application software.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject();
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
	public static final POIComponentTypeCode SecurityParameters = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityParameters";
			definition = "Security parameters of the point of interaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject();
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
	public static final POIComponentTypeCode Server = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Server";
			definition = "Payment server of a point of interaction system.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject();
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
	public static final POIComponentTypeCode Terminal = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Terminal";
			definition = "Payment terminal point of interaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject();
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
	public static final POIComponentTypeCode TerminalParameters = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminalParameters";
			definition = "Manufacturer configuration parameters of the point of interaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject();
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
	public static final POIComponentTypeCode CertificateParameters = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateParameters";
			definition = "Certificate provided by a terminal manager.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject();
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
	public static final POIComponentTypeCode TMSProtocolParameters = new POIComponentTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSProtocolParameters";
			definition = "Configuration parameters for the TMS protocol.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentTypeCode.mmObject();
			codeName = "TMSP";
		}
	};
	final static private LinkedHashMap<String, POIComponentTypeCode> codesByName = new LinkedHashMap<>();

	protected POIComponentTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("SOFT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "POIComponentTypeCode";
				definition = "Generic component type belonging to a POI (Point of Interaction) Terminal.";
				derivation_lazy = () -> Arrays.asList(POIComponentType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POIComponentTypeCode.Soft, com.tools20022.repository.codeset.POIComponentTypeCode.EMVKernel,
						com.tools20022.repository.codeset.POIComponentTypeCode.EMVLevel1, com.tools20022.repository.codeset.POIComponentTypeCode.MerchantInterface, com.tools20022.repository.codeset.POIComponentTypeCode.CardholderInterface,
						com.tools20022.repository.codeset.POIComponentTypeCode.SecureModule, com.tools20022.repository.codeset.POIComponentTypeCode.PINEntryDevice, com.tools20022.repository.codeset.POIComponentTypeCode.AcquirerParameters,
						com.tools20022.repository.codeset.POIComponentTypeCode.MerchantParameters, com.tools20022.repository.codeset.POIComponentTypeCode.VendorParameters,
						com.tools20022.repository.codeset.POIComponentTypeCode.AcquirerProtocolParameters, com.tools20022.repository.codeset.POIComponentTypeCode.ApplicationParameters,
						com.tools20022.repository.codeset.POIComponentTypeCode.Device, com.tools20022.repository.codeset.POIComponentTypeCode.Driver, com.tools20022.repository.codeset.POIComponentTypeCode.Middleware,
						com.tools20022.repository.codeset.POIComponentTypeCode.OperatingSystem, com.tools20022.repository.codeset.POIComponentTypeCode.PaymentApplication,
						com.tools20022.repository.codeset.POIComponentTypeCode.SecurityParameters, com.tools20022.repository.codeset.POIComponentTypeCode.Server, com.tools20022.repository.codeset.POIComponentTypeCode.Terminal,
						com.tools20022.repository.codeset.POIComponentTypeCode.TerminalParameters, com.tools20022.repository.codeset.POIComponentTypeCode.CertificateParameters,
						com.tools20022.repository.codeset.POIComponentTypeCode.TMSProtocolParameters);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Soft.getCodeName().get(), Soft);
		codesByName.put(EMVKernel.getCodeName().get(), EMVKernel);
		codesByName.put(EMVLevel1.getCodeName().get(), EMVLevel1);
		codesByName.put(MerchantInterface.getCodeName().get(), MerchantInterface);
		codesByName.put(CardholderInterface.getCodeName().get(), CardholderInterface);
		codesByName.put(SecureModule.getCodeName().get(), SecureModule);
		codesByName.put(PINEntryDevice.getCodeName().get(), PINEntryDevice);
		codesByName.put(AcquirerParameters.getCodeName().get(), AcquirerParameters);
		codesByName.put(MerchantParameters.getCodeName().get(), MerchantParameters);
		codesByName.put(VendorParameters.getCodeName().get(), VendorParameters);
		codesByName.put(AcquirerProtocolParameters.getCodeName().get(), AcquirerProtocolParameters);
		codesByName.put(ApplicationParameters.getCodeName().get(), ApplicationParameters);
		codesByName.put(Device.getCodeName().get(), Device);
		codesByName.put(Driver.getCodeName().get(), Driver);
		codesByName.put(Middleware.getCodeName().get(), Middleware);
		codesByName.put(OperatingSystem.getCodeName().get(), OperatingSystem);
		codesByName.put(PaymentApplication.getCodeName().get(), PaymentApplication);
		codesByName.put(SecurityParameters.getCodeName().get(), SecurityParameters);
		codesByName.put(Server.getCodeName().get(), Server);
		codesByName.put(Terminal.getCodeName().get(), Terminal);
		codesByName.put(TerminalParameters.getCodeName().get(), TerminalParameters);
		codesByName.put(CertificateParameters.getCodeName().get(), CertificateParameters);
		codesByName.put(TMSProtocolParameters.getCodeName().get(), TMSProtocolParameters);
	}

	public static POIComponentTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static POIComponentTypeCode[] values() {
		POIComponentTypeCode[] values = new POIComponentTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, POIComponentTypeCode> {
		@Override
		public POIComponentTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(POIComponentTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}