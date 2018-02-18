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
import com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode#AccreditedInvestor
 * BeneficiaryCertificationTypeCode.AccreditedInvestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode#DomicileCountry
 * BeneficiaryCertificationTypeCode.DomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode#NonDomicileCountry
 * BeneficiaryCertificationTypeCode.NonDomicileCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode#FullBeneficialOwnerBreakdown
 * BeneficiaryCertificationTypeCode.FullBeneficialOwnerBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode#QIBCertification
 * BeneficiaryCertificationTypeCode.QIBCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode#TaxRateBreakdown
 * BeneficiaryCertificationTypeCode.TaxRateBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode#NonCompany
 * BeneficiaryCertificationTypeCode.NonCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode#BeneficialOwnerPaperwork
 * BeneficiaryCertificationTypeCode.BeneficialOwnerPaperwork}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode#ICSDParticipantBreakdown
 * BeneficiaryCertificationTypeCode.ICSDParticipantBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode#NarrativeDescription
 * BeneficiaryCertificationTypeCode.NarrativeDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode#FractionBreakdown
 * BeneficiaryCertificationTypeCode.FractionBreakdown}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BeneficiaryCertificationTypeCode extends MMCode {

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
	public static final BeneficiaryCertificationTypeCode AccreditedInvestor = new BeneficiaryCertificationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccreditedInvestor";
			definition = "The holder of the security has to irrevocably certify that it is an Accredited Investor as defined in US Securities and Exchange Commission Regulation D.";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.mmObject();
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
	public static final BeneficiaryCertificationTypeCode DomicileCountry = new BeneficiaryCertificationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DomicileCountry";
			definition = "The holder of the security has to certify his domicile.";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.mmObject();
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
	public static final BeneficiaryCertificationTypeCode NonDomicileCountry = new BeneficiaryCertificationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonDomicileCountry";
			definition = "The holder of the security has to certify, in line with the terms of the corporate action, that it is not domiciled in the country indicated.";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.mmObject();
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
	public static final BeneficiaryCertificationTypeCode FullBeneficialOwnerBreakdown = new BeneficiaryCertificationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FullBeneficialOwnerBreakdown";
			definition = "The holder of the security has to provide his beneficial owner details for disclosure/instruction purpose.";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.mmObject();
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
	public static final BeneficiaryCertificationTypeCode QIBCertification = new BeneficiaryCertificationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QIBCertification";
			definition = "The holder of the security has to irrevocably certify that it is a Qualified Institutional Buyer as defined in US Securities and Exchange Commission Rule 144A.";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.mmObject();
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
	public static final BeneficiaryCertificationTypeCode TaxRateBreakdown = new BeneficiaryCertificationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxRateBreakdown";
			definition = "The holder of the security has to provide basic details on nominals and associated tax rate to be used by the account servicer.";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.mmObject();
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
	public static final BeneficiaryCertificationTypeCode NonCompany = new BeneficiaryCertificationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonCompany";
			definition = "The holder of the security has to certify he is an Non-Company related person.";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.mmObject();
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
	public static final BeneficiaryCertificationTypeCode BeneficialOwnerPaperwork = new BeneficiaryCertificationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BeneficialOwnerPaperwork";
			definition = "Indicates if the Beneficial Owner is responsible to fill in the paperwork.";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.mmObject();
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
	public static final BeneficiaryCertificationTypeCode ICSDParticipantBreakdown = new BeneficiaryCertificationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ICSDParticipantBreakdown";
			definition = "The (I)CSD has to provide its participants' details for disclosure purpose to the issuer/issuer’s agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.mmObject();
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
	public static final BeneficiaryCertificationTypeCode NarrativeDescription = new BeneficiaryCertificationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NarrativeDescription";
			definition = "See narrative field for certification requirements.";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.mmObject();
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
	public static final BeneficiaryCertificationTypeCode FractionBreakdown = new BeneficiaryCertificationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionBreakdown";
			definition = "Indicates that the rounding rule in the Fraction Disposition component at the option level can be offered at the beneficial owner level.";
			owner_lazy = () -> com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.mmObject();
			codeName = "FRAC";
		}
	};
	final static private LinkedHashMap<String, BeneficiaryCertificationTypeCode> codesByName = new LinkedHashMap<>();

	protected BeneficiaryCertificationTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACCI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BeneficiaryCertificationTypeCode";
				definition = "The holder of the security has to irrevocably certify that it is a Qualified Institutional Buyer as defined in US Securities and Exchange Commission Rule 144A.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.AccreditedInvestor, com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.DomicileCountry,
						com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.NonDomicileCountry, com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.FullBeneficialOwnerBreakdown,
						com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.QIBCertification, com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.TaxRateBreakdown,
						com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.NonCompany, com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.BeneficialOwnerPaperwork,
						com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.ICSDParticipantBreakdown, com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.NarrativeDescription,
						com.tools20022.repository.codeset.BeneficiaryCertificationTypeCode.FractionBreakdown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccreditedInvestor.getCodeName().get(), AccreditedInvestor);
		codesByName.put(DomicileCountry.getCodeName().get(), DomicileCountry);
		codesByName.put(NonDomicileCountry.getCodeName().get(), NonDomicileCountry);
		codesByName.put(FullBeneficialOwnerBreakdown.getCodeName().get(), FullBeneficialOwnerBreakdown);
		codesByName.put(QIBCertification.getCodeName().get(), QIBCertification);
		codesByName.put(TaxRateBreakdown.getCodeName().get(), TaxRateBreakdown);
		codesByName.put(NonCompany.getCodeName().get(), NonCompany);
		codesByName.put(BeneficialOwnerPaperwork.getCodeName().get(), BeneficialOwnerPaperwork);
		codesByName.put(ICSDParticipantBreakdown.getCodeName().get(), ICSDParticipantBreakdown);
		codesByName.put(NarrativeDescription.getCodeName().get(), NarrativeDescription);
		codesByName.put(FractionBreakdown.getCodeName().get(), FractionBreakdown);
	}

	public static BeneficiaryCertificationTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BeneficiaryCertificationTypeCode[] values() {
		BeneficiaryCertificationTypeCode[] values = new BeneficiaryCertificationTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BeneficiaryCertificationTypeCode> {
		@Override
		public BeneficiaryCertificationTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BeneficiaryCertificationTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}