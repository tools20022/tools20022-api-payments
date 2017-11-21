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
 * The holder of the security has to irrevocably certify that it is a Qualified
 * Institutional Buyer as defined in US Securities and Exchange Commission Rule
 * 144A.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode#mmAccreditedInvestor
 * BeneficiaryCertificationTypeCode.mmAccreditedInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode#mmDomicileCountry
 * BeneficiaryCertificationTypeCode.mmDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode#mmNonDomicileCountry
 * BeneficiaryCertificationTypeCode.mmNonDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode#mmFullBeneficialOwnerBreakdown
 * BeneficiaryCertificationTypeCode.mmFullBeneficialOwnerBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode#mmQIBCertification
 * BeneficiaryCertificationTypeCode.mmQIBCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode#mmTaxRateBreakdown
 * BeneficiaryCertificationTypeCode.mmTaxRateBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode#mmNonCompany
 * BeneficiaryCertificationTypeCode.mmNonCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode#mmBeneficialOwnerPaperwork
 * BeneficiaryCertificationTypeCode.mmBeneficialOwnerPaperwork}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode#mmICSDParticipantBreakdown
 * BeneficiaryCertificationTypeCode.mmICSDParticipantBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode#mmNarrativeDescription
 * BeneficiaryCertificationTypeCode.mmNarrativeDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode#mmFractionBreakdown
 * BeneficiaryCertificationTypeCode.mmFractionBreakdown}</li>
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
 * <li>"ACCI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BeneficiaryCertificationTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The holder of the security has to irrevocably certify that it is a Qualified Institutional Buyer as defined in US Securities and Exchange Commission Rule 144A."
 * </li>
 * </ul>
 */
public class BeneficiaryCertificationTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The holder of the security has to irrevocably certify that it is an
	 * Accredited Investor as defined in US Securities and Exchange Commission
	 * Regulation D.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode
	 * BeneficiaryCertificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccreditedInvestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The holder of the security has to irrevocably certify that it is an Accredited Investor as defined in US Securities and Exchange Commission Regulation D."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAccreditedInvestor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccreditedInvestor";
			definition = "The holder of the security has to irrevocably certify that it is an Accredited Investor as defined in US Securities and Exchange Commission Regulation D.";
			owner_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
			codeName = "ACCI";
		}
	};
	/**
	 * The holder of the security has to certify his domicile.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode
	 * BeneficiaryCertificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DOMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomicileCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The holder of the security has to certify his domicile."</li>
	 * </ul>
	 */
	public static final MMCode mmDomicileCountry = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DomicileCountry";
			definition = "The holder of the security has to certify his domicile.";
			owner_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
			codeName = "DOMI";
		}
	};
	/**
	 * The holder of the security has to certify, in line with the terms of the
	 * corporate action, that it is not domiciled in the country indicated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode
	 * BeneficiaryCertificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NDOM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDomicileCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The holder of the security has to certify, in line with the terms of the corporate action, that it is not domiciled in the country indicated."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNonDomicileCountry = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonDomicileCountry";
			definition = "The holder of the security has to certify, in line with the terms of the corporate action, that it is not domiciled in the country indicated.";
			owner_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
			codeName = "NDOM";
		}
	};
	/**
	 * The holder of the security has to provide his beneficial owner details
	 * for disclosure/instruction purpose.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode
	 * BeneficiaryCertificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FULL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullBeneficialOwnerBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The holder of the security has to provide his beneficial owner details for disclosure/instruction purpose."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFullBeneficialOwnerBreakdown = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FullBeneficialOwnerBreakdown";
			definition = "The holder of the security has to provide his beneficial owner details for disclosure/instruction purpose.";
			owner_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
			codeName = "FULL";
		}
	};
	/**
	 * The holder of the security has to irrevocably certify that it is a
	 * Qualified Institutional Buyer as defined in US Securities and Exchange
	 * Commission Rule 144A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode
	 * BeneficiaryCertificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QIBB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QIBCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The holder of the security has to irrevocably certify that it is a Qualified Institutional Buyer as defined in US Securities and Exchange Commission Rule 144A."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmQIBCertification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QIBCertification";
			definition = "The holder of the security has to irrevocably certify that it is a Qualified Institutional Buyer as defined in US Securities and Exchange Commission Rule 144A.";
			owner_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
			codeName = "QIBB";
		}
	};
	/**
	 * The holder of the security has to provide basic details on nominals and
	 * associated tax rate to be used by the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode
	 * BeneficiaryCertificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRBD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRateBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The holder of the security has to provide basic details on nominals and associated tax rate to be used by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTaxRateBreakdown = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxRateBreakdown";
			definition = "The holder of the security has to provide basic details on nominals and associated tax rate to be used by the account servicer.";
			owner_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
			codeName = "TRBD";
		}
	};
	/**
	 * The holder of the security has to certify he is an Non-Company related
	 * person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode
	 * BeneficiaryCertificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCOM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The holder of the security has to certify he is an Non-Company related person."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNonCompany = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonCompany";
			definition = "The holder of the security has to certify he is an Non-Company related person.";
			owner_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
			codeName = "NCOM";
		}
	};
	/**
	 * Indicates if the Beneficial Owner is responsible to fill in the
	 * paperwork.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode
	 * BeneficiaryCertificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAPW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerPaperwork"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the Beneficial Owner is responsible to fill in the paperwork."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBeneficialOwnerPaperwork = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BeneficialOwnerPaperwork";
			definition = "Indicates if the Beneficial Owner is responsible to fill in the paperwork.";
			owner_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
			codeName = "PAPW";
		}
	};
	/**
	 * The (I)CSD has to provide its participants' details for disclosure
	 * purpose to the issuer/issuer’s agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode
	 * BeneficiaryCertificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PABD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICSDParticipantBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The (I)CSD has to provide its participants' details for disclosure purpose to the issuer/issuer’s agent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmICSDParticipantBreakdown = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ICSDParticipantBreakdown";
			definition = "The (I)CSD has to provide its participants' details for disclosure purpose to the issuer/issuer’s agent.";
			owner_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
			codeName = "PABD";
		}
	};
	/**
	 * See narrative field for certification requirements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode
	 * BeneficiaryCertificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NARR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "See narrative field for certification requirements."</li>
	 * </ul>
	 */
	public static final MMCode mmNarrativeDescription = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NarrativeDescription";
			definition = "See narrative field for certification requirements.";
			owner_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
			codeName = "NARR";
		}
	};
	/**
	 * Indicates that the rounding rule in the Fraction Disposition component at
	 * the option level can be offered at the beneficial owner level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode
	 * BeneficiaryCertificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the rounding rule in the Fraction Disposition component at the option level can be offered at the beneficial owner level."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFractionBreakdown = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionBreakdown";
			definition = "Indicates that the rounding rule in the Fraction Disposition component at the option level can be offered at the beneficial owner level.";
			owner_lazy = () -> BeneficiaryCertificationTypeCode.mmObject();
			codeName = "FRAC";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ACCI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BeneficiaryCertificationTypeCode";
				definition = "The holder of the security has to irrevocably certify that it is a Qualified Institutional Buyer as defined in US Securities and Exchange Commission Rule 144A.";
				code_lazy = () -> Arrays.asList(BeneficiaryCertificationTypeCode.mmAccreditedInvestor, BeneficiaryCertificationTypeCode.mmDomicileCountry, BeneficiaryCertificationTypeCode.mmNonDomicileCountry,
						BeneficiaryCertificationTypeCode.mmFullBeneficialOwnerBreakdown, BeneficiaryCertificationTypeCode.mmQIBCertification, BeneficiaryCertificationTypeCode.mmTaxRateBreakdown,
						BeneficiaryCertificationTypeCode.mmNonCompany, BeneficiaryCertificationTypeCode.mmBeneficialOwnerPaperwork, BeneficiaryCertificationTypeCode.mmICSDParticipantBreakdown,
						BeneficiaryCertificationTypeCode.mmNarrativeDescription, BeneficiaryCertificationTypeCode.mmFractionBreakdown);
			}
		});
		return mmObject_lazy.get();
	}
}