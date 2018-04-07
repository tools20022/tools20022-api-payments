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
import com.tools20022.repository.codeset.TaxWithholdingMethodCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specified the method by which the tax on the interests is to be processed
 * i.e. either withheld at source or reported to tax authorities or a tax
 * certificate has been provided by the beneficiary.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethodCode#WithholdTax
 * TaxWithholdingMethodCode.WithholdTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethodCode#ReportTax
 * TaxWithholdingMethodCode.ReportTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethodCode#TaxCertificate
 * TaxWithholdingMethodCode.TaxCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethodCode#WithholdTaxAndReport
 * TaxWithholdingMethodCode.WithholdTaxAndReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethodCode#WithholdingCorporateTax
 * TaxWithholdingMethodCode.WithholdingCorporateTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethodCode#Exempt
 * TaxWithholdingMethodCode.Exempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethodCode#Accountant
 * TaxWithholdingMethodCode.Accountant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethodCode#InvestmentCompany
 * TaxWithholdingMethodCode.InvestmentCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethodCode#MinorityInterestTax
 * TaxWithholdingMethodCode.MinorityInterestTax}</li>
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
 * <li>"WTHD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxWithholdingMethodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specified the method by which the tax on the interests is to be processed i.e. either withheld at source or reported to tax authorities or a tax certificate has been provided by the beneficiary."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxWithholdingMethodCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Tax is withheld at source.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethodCode
	 * TaxWithholdingMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WTHD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax is withheld at source."</li>
	 * </ul>
	 */
	public static final TaxWithholdingMethodCode WithholdTax = new TaxWithholdingMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithholdTax";
			definition = "Tax is withheld at source.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxWithholdingMethodCode.mmObject();
			codeName = "WTHD";
		}
	};
	/**
	 * Tax information is reported to the tax authorities and therefore not
	 * withheld at source.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethodCode
	 * TaxWithholdingMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax information is reported to the tax authorities and therefore not withheld at source."
	 * </li>
	 * </ul>
	 */
	public static final TaxWithholdingMethodCode ReportTax = new TaxWithholdingMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReportTax";
			definition = "Tax information is reported to the tax authorities and therefore not withheld at source.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxWithholdingMethodCode.mmObject();
			codeName = "REPT";
		}
	};
	/**
	 * Tax certificate is provided by the beneficiary from its tax authority in
	 * its country of residence. Therefore, the obligation of withholding tax is
	 * waived and tax information will be reported to the tax authorities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethodCode
	 * TaxWithholdingMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRTF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax certificate is provided by the beneficiary from its tax authority in its country of residence. Therefore, the obligation of withholding tax is waived and tax information will be reported to the tax authorities."
	 * </li>
	 * </ul>
	 */
	public static final TaxWithholdingMethodCode TaxCertificate = new TaxWithholdingMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxCertificate";
			definition = "Tax certificate is provided by the beneficiary from its tax authority in its country of residence. Therefore, the obligation of withholding tax is waived and tax information will be reported to the tax authorities.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxWithholdingMethodCode.mmObject();
			codeName = "CRTF";
		}
	};
	/**
	 * Tax is withheld at source and the tax information is also reported to the
	 * tax authorities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethodCode
	 * TaxWithholdingMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WTRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdTaxAndReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax is withheld at source and the tax information is also reported to the tax authorities."
	 * </li>
	 * </ul>
	 */
	public static final TaxWithholdingMethodCode WithholdTaxAndReport = new TaxWithholdingMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithholdTaxAndReport";
			definition = "Tax is withheld at source and the tax information is also reported to the tax authorities.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxWithholdingMethodCode.mmObject();
			codeName = "WTRE";
		}
	};
	/**
	 * Withholding tax is applied to a corporate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethodCode
	 * TaxWithholdingMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WHCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingCorporateTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Withholding tax is applied to a corporate."</li>
	 * </ul>
	 */
	public static final TaxWithholdingMethodCode WithholdingCorporateTax = new TaxWithholdingMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingCorporateTax";
			definition = "Withholding tax is applied to a corporate.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxWithholdingMethodCode.mmObject();
			codeName = "WHCO";
		}
	};
	/**
	 * Dividend tax is exempt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethodCode
	 * TaxWithholdingMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend tax is exempt."</li>
	 * </ul>
	 */
	public static final TaxWithholdingMethodCode Exempt = new TaxWithholdingMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Exempt";
			definition = "Dividend tax is exempt.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxWithholdingMethodCode.mmObject();
			codeName = "EXMT";
		}
	};
	/**
	 * Dividend tax is exempt according to the accountant.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethodCode
	 * TaxWithholdingMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accountant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend tax is exempt according to the accountant."</li>
	 * </ul>
	 */
	public static final TaxWithholdingMethodCode Accountant = new TaxWithholdingMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Accountant";
			definition = "Dividend tax is exempt according to the accountant.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxWithholdingMethodCode.mmObject();
			codeName = "ACCT";
		}
	};
	/**
	 * Withholding tax is applied to an investment company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethodCode
	 * TaxWithholdingMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Withholding tax is applied to an investment company."</li>
	 * </ul>
	 */
	public static final TaxWithholdingMethodCode InvestmentCompany = new TaxWithholdingMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentCompany";
			definition = "Withholding tax is applied to an investment company.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxWithholdingMethodCode.mmObject();
			codeName = "INVE";
		}
	};
	/**
	 * Minority interest tax is withheld.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethodCode
	 * TaxWithholdingMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MITX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinorityInterestTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minority interest tax is withheld."</li>
	 * </ul>
	 */
	public static final TaxWithholdingMethodCode MinorityInterestTax = new TaxWithholdingMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinorityInterestTax";
			definition = "Minority interest tax is withheld.";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxWithholdingMethodCode.mmObject();
			codeName = "MITX";
		}
	};
	final static private LinkedHashMap<String, TaxWithholdingMethodCode> codesByName = new LinkedHashMap<>();

	protected TaxWithholdingMethodCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("WTHD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxWithholdingMethodCode";
				definition = "Specified the method by which the tax on the interests is to be processed i.e. either withheld at source or reported to tax authorities or a tax certificate has been provided by the beneficiary.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxWithholdingMethodCode.WithholdTax, com.tools20022.repository.codeset.TaxWithholdingMethodCode.ReportTax,
						com.tools20022.repository.codeset.TaxWithholdingMethodCode.TaxCertificate, com.tools20022.repository.codeset.TaxWithholdingMethodCode.WithholdTaxAndReport,
						com.tools20022.repository.codeset.TaxWithholdingMethodCode.WithholdingCorporateTax, com.tools20022.repository.codeset.TaxWithholdingMethodCode.Exempt,
						com.tools20022.repository.codeset.TaxWithholdingMethodCode.Accountant, com.tools20022.repository.codeset.TaxWithholdingMethodCode.InvestmentCompany,
						com.tools20022.repository.codeset.TaxWithholdingMethodCode.MinorityInterestTax);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(WithholdTax.getCodeName().get(), WithholdTax);
		codesByName.put(ReportTax.getCodeName().get(), ReportTax);
		codesByName.put(TaxCertificate.getCodeName().get(), TaxCertificate);
		codesByName.put(WithholdTaxAndReport.getCodeName().get(), WithholdTaxAndReport);
		codesByName.put(WithholdingCorporateTax.getCodeName().get(), WithholdingCorporateTax);
		codesByName.put(Exempt.getCodeName().get(), Exempt);
		codesByName.put(Accountant.getCodeName().get(), Accountant);
		codesByName.put(InvestmentCompany.getCodeName().get(), InvestmentCompany);
		codesByName.put(MinorityInterestTax.getCodeName().get(), MinorityInterestTax);
	}

	public static TaxWithholdingMethodCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxWithholdingMethodCode[] values() {
		TaxWithholdingMethodCode[] values = new TaxWithholdingMethodCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxWithholdingMethodCode> {
		@Override
		public TaxWithholdingMethodCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxWithholdingMethodCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}