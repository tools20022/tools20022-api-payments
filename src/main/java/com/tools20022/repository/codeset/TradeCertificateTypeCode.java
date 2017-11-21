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
 * Specifies the type of trade certificate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode#mmAnalysis
 * TradeCertificateTypeCode.mmAnalysis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode#mmQuality
 * TradeCertificateTypeCode.mmQuality}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode#mmQuantity
 * TradeCertificateTypeCode.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode#mmWeight
 * TradeCertificateTypeCode.mmWeight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode#mmOrigin
 * TradeCertificateTypeCode.mmOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode#mmHealth
 * TradeCertificateTypeCode.mmHealth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode#mmPhytosanitary
 * TradeCertificateTypeCode.mmPhytosanitary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode#mmBeneficiary
 * TradeCertificateTypeCode.mmBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode#mmShippingLine
 * TradeCertificateTypeCode.mmShippingLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode#mmUndefined1
 * TradeCertificateTypeCode.mmUndefined1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode#mmUndefined2
 * TradeCertificateTypeCode.mmUndefined2}</li>
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
 * <li>"ANLY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeCertificateTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of trade certificate."</li>
 * </ul>
 */
public class TradeCertificateTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Certificate of analysis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode
	 * TradeCertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANLY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Analysis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate of analysis."</li>
	 * </ul>
	 */
	public static final MMCode mmAnalysis = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Analysis";
			definition = "Certificate of analysis.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "ANLY";
		}
	};
	/**
	 * Certificate of quality.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode
	 * TradeCertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QUAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quality"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate of quality."</li>
	 * </ul>
	 */
	public static final MMCode mmQuality = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quality";
			definition = "Certificate of quality.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "QUAL";
		}
	};
	/**
	 * Certificate of quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode
	 * TradeCertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QUAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate of quantity."</li>
	 * </ul>
	 */
	public static final MMCode mmQuantity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Certificate of quantity.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "QUAN";
		}
	};
	/**
	 * Certificate of weight.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode
	 * TradeCertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WEIG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Weight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate of weight."</li>
	 * </ul>
	 */
	public static final MMCode mmWeight = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Weight";
			definition = "Certificate of weight.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "WEIG";
		}
	};
	/**
	 * Certificate of origin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode
	 * TradeCertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORIG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Origin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate of origin."</li>
	 * </ul>
	 */
	public static final MMCode mmOrigin = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Origin";
			definition = "Certificate of origin.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "ORIG";
		}
	};
	/**
	 * Certificate of health.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode
	 * TradeCertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HEAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Health"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate of health."</li>
	 * </ul>
	 */
	public static final MMCode mmHealth = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Health";
			definition = "Certificate of health.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "HEAL";
		}
	};
	/**
	 * Phytosanitary certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode
	 * TradeCertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHYT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Phytosanitary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Phytosanitary certificate."</li>
	 * </ul>
	 */
	public static final MMCode mmPhytosanitary = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Phytosanitary";
			definition = "Phytosanitary certificate.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "PHYT";
		}
	};
	/**
	 * Beneficiary certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode
	 * TradeCertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BENE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Beneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Beneficiary certificate."</li>
	 * </ul>
	 */
	public static final MMCode mmBeneficiary = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Beneficiary";
			definition = "Beneficiary certificate.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "BENE";
		}
	};
	/**
	 * Shipping line certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode
	 * TradeCertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Shipping line certificate."</li>
	 * </ul>
	 */
	public static final MMCode mmShippingLine = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ShippingLine";
			definition = "Shipping line certificate.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "SHIP";
		}
	};
	/**
	 * Undefined certificate at this stage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode
	 * TradeCertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UND1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undefined1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undefined certificate at this stage."</li>
	 * </ul>
	 */
	public static final MMCode mmUndefined1 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Undefined1";
			definition = "Undefined certificate at this stage.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "UND1";
		}
	};
	/**
	 * Undefined certificate at this stage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode
	 * TradeCertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UND2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undefined2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undefined certificate at this stage."</li>
	 * </ul>
	 */
	public static final MMCode mmUndefined2 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Undefined2";
			definition = "Undefined certificate at this stage.";
			owner_lazy = () -> TradeCertificateTypeCode.mmObject();
			codeName = "UND2";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ANLY");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeCertificateTypeCode";
				definition = "Specifies the type of trade certificate.";
				code_lazy = () -> Arrays.asList(TradeCertificateTypeCode.mmAnalysis, TradeCertificateTypeCode.mmQuality, TradeCertificateTypeCode.mmQuantity, TradeCertificateTypeCode.mmWeight, TradeCertificateTypeCode.mmOrigin,
						TradeCertificateTypeCode.mmHealth, TradeCertificateTypeCode.mmPhytosanitary, TradeCertificateTypeCode.mmBeneficiary, TradeCertificateTypeCode.mmShippingLine, TradeCertificateTypeCode.mmUndefined1,
						TradeCertificateTypeCode.mmUndefined2);
			}
		});
		return mmObject_lazy.get();
	}
}