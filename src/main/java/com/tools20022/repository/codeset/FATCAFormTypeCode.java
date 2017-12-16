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
import com.tools20022.repository.codeset.FATCAFormTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of Foreign Account Tax Compliance Act (FATCA) form.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode#CertificateForeignStatusBeneficialOwner
 * FATCAFormTypeCode.mmCertificateForeignStatusBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode#CertificateLossNationality
 * FATCAFormTypeCode.mmCertificateLossNationality}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode#SelfCertification
 * FATCAFormTypeCode.mmSelfCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode#SelfCertificationLossNationality
 * FATCAFormTypeCode.mmSelfCertificationLossNationality}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode#CertificateForeignIntermediary
 * FATCAFormTypeCode.mmCertificateForeignIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode#TaxpayerIdentificationNumberRequest
 * FATCAFormTypeCode.mmTaxpayerIdentificationNumberRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode#CertificateForeignPersonsClaim
 * FATCAFormTypeCode.mmCertificateForeignPersonsClaim}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FATCAFormTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of Foreign Account Tax Compliance Act (FATCA) form."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FATCAFormTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Certificate of foreign status of beneficial owner (also known as IRS form
	 * W-8BEN).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode
	 * FATCAFormTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CER1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateForeignStatusBeneficialOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certificate of foreign status of beneficial owner (also known as IRS form W-8BEN)."
	 * </li>
	 * </ul>
	 */
	public static final FATCAFormTypeCode CertificateForeignStatusBeneficialOwner = new FATCAFormTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateForeignStatusBeneficialOwner";
			definition = "Certificate of foreign status of beneficial owner (also known as IRS form W-8BEN).";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAFormTypeCode.mmObject();
			codeName = "CER1";
		}
	};
	/**
	 * Certificate of loss of nationality.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode
	 * FATCAFormTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CER2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateLossNationality"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate of loss of nationality."</li>
	 * </ul>
	 */
	public static final FATCAFormTypeCode CertificateLossNationality = new FATCAFormTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateLossNationality";
			definition = "Certificate of loss of nationality.";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAFormTypeCode.mmObject();
			codeName = "CER2";
		}
	};
	/**
	 * Self certification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode
	 * FATCAFormTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CER3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Self certification."</li>
	 * </ul>
	 */
	public static final FATCAFormTypeCode SelfCertification = new FATCAFormTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfCertification";
			definition = "Self certification.";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAFormTypeCode.mmObject();
			codeName = "CER3";
		}
	};
	/**
	 * Self certificate of loss of nationality (also known as IRS form I-407).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode
	 * FATCAFormTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CER4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfCertificationLossNationality"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Self certificate of loss of nationality (also known as IRS form I-407)."
	 * </li>
	 * </ul>
	 */
	public static final FATCAFormTypeCode SelfCertificationLossNationality = new FATCAFormTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfCertificationLossNationality";
			definition = "Self certificate of loss of nationality (also known as IRS form I-407).";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAFormTypeCode.mmObject();
			codeName = "CER4";
		}
	};
	/**
	 * Certificate of foreign intermediary (also known as IRS form W-8IMY).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode
	 * FATCAFormTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CER5"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateForeignIntermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certificate of foreign intermediary (also known as IRS form W-8IMY)."</li>
	 * </ul>
	 */
	public static final FATCAFormTypeCode CertificateForeignIntermediary = new FATCAFormTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateForeignIntermediary";
			definition = "Certificate of foreign intermediary (also known as IRS form W-8IMY).";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAFormTypeCode.mmObject();
			codeName = "CER5";
		}
	};
	/**
	 * Form is a request for taxpayer identification number and certification
	 * (also known as IRS form W9).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode
	 * FATCAFormTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CER6"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxpayerIdentificationNumberRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Form is a request for taxpayer identification number and certification (also known as IRS form W9)."
	 * </li>
	 * </ul>
	 */
	public static final FATCAFormTypeCode TaxpayerIdentificationNumberRequest = new FATCAFormTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxpayerIdentificationNumberRequest";
			definition = "Form is a request for taxpayer identification number and certification (also known as IRS form W9).";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAFormTypeCode.mmObject();
			codeName = "CER6";
		}
	};
	/**
	 * Certificate of foreign person's claim that income is effectively
	 * connected with the conduct of a trade or business in the United States
	 * (also known as IRS form W-8BEN-E).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCAFormTypeCode
	 * FATCAFormTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CER7"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateForeignPersonsClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certificate of foreign person's claim that income is effectively connected with the conduct of a trade or business in the United States (also known as IRS form W-8BEN-E)."
	 * </li>
	 * </ul>
	 */
	public static final FATCAFormTypeCode CertificateForeignPersonsClaim = new FATCAFormTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateForeignPersonsClaim";
			definition = "Certificate of foreign person's claim that income is effectively connected with the conduct of a trade or business in the United States (also known as IRS form W-8BEN-E).";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCAFormTypeCode.mmObject();
			codeName = "CER7";
		}
	};
	final static private LinkedHashMap<String, FATCAFormTypeCode> codesByName = new LinkedHashMap<>();

	protected FATCAFormTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FATCAFormTypeCode";
				definition = "Specifies the type of Foreign Account Tax Compliance Act (FATCA) form.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FATCAFormTypeCode.CertificateForeignStatusBeneficialOwner, com.tools20022.repository.codeset.FATCAFormTypeCode.CertificateLossNationality,
						com.tools20022.repository.codeset.FATCAFormTypeCode.SelfCertification, com.tools20022.repository.codeset.FATCAFormTypeCode.SelfCertificationLossNationality,
						com.tools20022.repository.codeset.FATCAFormTypeCode.CertificateForeignIntermediary, com.tools20022.repository.codeset.FATCAFormTypeCode.TaxpayerIdentificationNumberRequest,
						com.tools20022.repository.codeset.FATCAFormTypeCode.CertificateForeignPersonsClaim);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CertificateForeignStatusBeneficialOwner.getCodeName().get(), CertificateForeignStatusBeneficialOwner);
		codesByName.put(CertificateLossNationality.getCodeName().get(), CertificateLossNationality);
		codesByName.put(SelfCertification.getCodeName().get(), SelfCertification);
		codesByName.put(SelfCertificationLossNationality.getCodeName().get(), SelfCertificationLossNationality);
		codesByName.put(CertificateForeignIntermediary.getCodeName().get(), CertificateForeignIntermediary);
		codesByName.put(TaxpayerIdentificationNumberRequest.getCodeName().get(), TaxpayerIdentificationNumberRequest);
		codesByName.put(CertificateForeignPersonsClaim.getCodeName().get(), CertificateForeignPersonsClaim);
	}

	public static FATCAFormTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FATCAFormTypeCode[] values() {
		FATCAFormTypeCode[] values = new FATCAFormTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FATCAFormTypeCode> {
		@Override
		public FATCAFormTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FATCAFormTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}