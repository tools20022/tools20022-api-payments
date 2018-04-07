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
import com.tools20022.repository.codeset.CreditQualityCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Credit quality rating of an issuer or financial obligation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditQualityCode#DefaultImminent
 * CreditQualityCode.DefaultImminent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditQualityCode#ExtremelySpeculative
 * CreditQualityCode.ExtremelySpeculative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditQualityCode#HighGrade
 * CreditQualityCode.HighGrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditQualityCode#HighlySpeculative
 * CreditQualityCode.HighlySpeculative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditQualityCode#InDefault
 * CreditQualityCode.InDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditQualityCode#LowerMediumGrade
 * CreditQualityCode.LowerMediumGrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditQualityCode#NonInvestmentGradeSpeculative
 * CreditQualityCode.NonInvestmentGradeSpeculative}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CreditQualityCode#Prime
 * CreditQualityCode.Prime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditQualityCode#SubstantialRisk
 * CreditQualityCode.SubstantialRisk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditQualityCode#UpperMediumGrade
 * CreditQualityCode.UpperMediumGrade}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CreditQualityCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Credit quality rating of an issuer or financial obligation."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CreditQualityCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Credit rating that indicates a default or default-like process has begun,
	 * or the issuer is in standstill, or for a closed funding vehicle, payment
	 * capacity is irrevocably impaired.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditQualityCode
	 * CreditQualityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFIM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultImminent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Credit rating that indicates a default or default-like process has begun, or the issuer is in standstill, or for a closed funding vehicle, payment capacity is irrevocably impaired."
	 * </li>
	 * </ul>
	 */
	public static final CreditQualityCode DefaultImminent = new CreditQualityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultImminent";
			definition = "Credit rating that indicates a default or default-like process has begun, or the issuer is in standstill, or for a closed funding vehicle, payment capacity is irrevocably impaired.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditQualityCode.mmObject();
			codeName = "DFIM";
		}
	};
	/**
	 * Default of some kind appears probable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditQualityCode
	 * CreditQualityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtremelySpeculative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Default of some kind appears probable."</li>
	 * </ul>
	 */
	public static final CreditQualityCode ExtremelySpeculative = new CreditQualityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtremelySpeculative";
			definition = "Default of some kind appears probable.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditQualityCode.mmObject();
			codeName = "EXSP";
		}
	};
	/**
	 * Credit rating that denotes expectations of very low default risk. It
	 * indicates a very strong capacity for payment of financial commitments
	 * which is not significantly vulnerable to foreseeable events.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditQualityCode
	 * CreditQualityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HIGR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighGrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Credit rating that denotes expectations of very low default risk. It indicates a very strong capacity for payment of financial commitments which is not significantly vulnerable to foreseeable events."
	 * </li>
	 * </ul>
	 */
	public static final CreditQualityCode HighGrade = new CreditQualityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HighGrade";
			definition = "Credit rating that denotes expectations of very low default risk. It indicates a very strong capacity for payment of financial commitments which is not significantly vulnerable to foreseeable events.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditQualityCode.mmObject();
			codeName = "HIGR";
		}
	};
	/**
	 * Credit rating that indicates that material default risk is present, but a
	 * limited margin of safety remains. Financial commitments are currently
	 * being met; however, capacity for continued payment is vulnerable to
	 * deterioration in the business and economic environment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditQualityCode
	 * CreditQualityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HISP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighlySpeculative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Credit rating that indicates that material default risk is present, but a limited margin of safety remains. Financial commitments are currently being met; however, capacity for continued payment is vulnerable to deterioration in the business and economic environment."
	 * </li>
	 * </ul>
	 */
	public static final CreditQualityCode HighlySpeculative = new CreditQualityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HighlySpeculative";
			definition = "Credit rating that indicates that material default risk is present, but a limited margin of safety remains. Financial commitments are currently being met; however, capacity for continued payment is vulnerable to deterioration in the business and economic environment.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditQualityCode.mmObject();
			codeName = "HISP";
		}
	};
	/**
	 * Credit rating that indicates an issuer has entered into bankruptcy
	 * filings, administration, receivership, liquidation or other formal
	 * winding-up procedure or that has otherwise ceased business.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditQualityCode
	 * CreditQualityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InDefault"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Credit rating that indicates an issuer has entered into bankruptcy filings, administration, receivership, liquidation or other formal winding-up procedure or that has otherwise ceased business."
	 * </li>
	 * </ul>
	 */
	public static final CreditQualityCode InDefault = new CreditQualityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InDefault";
			definition = "Credit rating that indicates an issuer has entered into bankruptcy filings, administration, receivership, liquidation or other formal winding-up procedure or that has otherwise ceased business.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditQualityCode.mmObject();
			codeName = "INDF";
		}
	};
	/**
	 * Credit rating that indicates that expectations of default risk are
	 * currently low. The capacity for payment of financial commitments is
	 * considered adequate, but adverse business or economic conditions are more
	 * likely to impair this capacity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditQualityCode
	 * CreditQualityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LMGR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LowerMediumGrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Credit rating that indicates that expectations of default risk are currently low. The capacity for payment of financial commitments is considered adequate, but adverse business or economic conditions are more likely to impair this capacity."
	 * </li>
	 * </ul>
	 */
	public static final CreditQualityCode LowerMediumGrade = new CreditQualityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LowerMediumGrade";
			definition = "Credit rating that indicates that expectations of default risk are currently low. The capacity for payment of financial commitments is considered adequate, but adverse business or economic conditions are more likely to impair this capacity.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditQualityCode.mmObject();
			codeName = "LMGR";
		}
	};
	/**
	 * Credit rating that indicates an elevated vulnerability to default risk,
	 * particularly in the event of adverse changes in business or economic
	 * conditions over time; however, business or financial flexibility exists
	 * that supports the servicing of financial commitments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditQualityCode
	 * CreditQualityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NIGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonInvestmentGradeSpeculative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Credit rating that indicates an elevated vulnerability to default risk, particularly in the event of adverse changes in business or economic conditions over time; however, business or financial flexibility exists that supports the servicing of financial commitments."
	 * </li>
	 * </ul>
	 */
	public static final CreditQualityCode NonInvestmentGradeSpeculative = new CreditQualityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonInvestmentGradeSpeculative";
			definition = "Credit rating that indicates an elevated vulnerability to default risk, particularly in the event of adverse changes in business or economic conditions over time; however, business or financial flexibility exists that supports the servicing of financial commitments.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditQualityCode.mmObject();
			codeName = "NIGS";
		}
	};
	/**
	 * Credit rating that denotes the lowest expectation of default risk.
	 * Assigned only in cases of exceptionally strong capacity for payment of
	 * financial commitments. Where the capacity to meet financial commitments
	 * is highly unlikely to be adversely affected by foreseeable events.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditQualityCode
	 * CreditQualityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRIM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Prime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Credit rating that denotes the lowest expectation of default risk. Assigned only in cases of exceptionally strong capacity for payment of financial commitments. Where the capacity to meet financial commitments is highly unlikely to be adversely affected by foreseeable events."
	 * </li>
	 * </ul>
	 */
	public static final CreditQualityCode Prime = new CreditQualityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Prime";
			definition = "Credit rating that denotes the lowest expectation of default risk. Assigned only in cases of exceptionally strong capacity for payment of financial commitments. Where the capacity to meet financial commitments is highly unlikely to be adversely affected by foreseeable events.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditQualityCode.mmObject();
			codeName = "PRIM";
		}
	};
	/**
	 * Default is a real possibility.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditQualityCode
	 * CreditQualityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SURI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstantialRisk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Default is a real possibility."</li>
	 * </ul>
	 */
	public static final CreditQualityCode SubstantialRisk = new CreditQualityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubstantialRisk";
			definition = "Default is a real possibility.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditQualityCode.mmObject();
			codeName = "SURI";
		}
	};
	/**
	 * Credit rating that denotes expectations of low default risk. The capacity
	 * for payment of financial commitments is considered strong. This capacity
	 * may, nevertheless, be more vulnerable to adverse business or economic
	 * conditions than is the case for higher ratings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditQualityCode
	 * CreditQualityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UMGR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpperMediumGrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Credit rating that denotes expectations of low default risk. The capacity for payment of financial commitments is considered strong. This capacity may, nevertheless, be more vulnerable to adverse business or economic conditions than is the case for higher ratings."
	 * </li>
	 * </ul>
	 */
	public static final CreditQualityCode UpperMediumGrade = new CreditQualityCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpperMediumGrade";
			definition = "Credit rating that denotes expectations of low default risk. The capacity for payment of financial commitments is considered strong. This capacity may, nevertheless, be more vulnerable to adverse business or economic conditions than is the case for higher ratings.";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditQualityCode.mmObject();
			codeName = "UMGR";
		}
	};
	final static private LinkedHashMap<String, CreditQualityCode> codesByName = new LinkedHashMap<>();

	protected CreditQualityCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CreditQualityCode";
				definition = "Credit quality rating of an issuer or financial obligation.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CreditQualityCode.DefaultImminent, com.tools20022.repository.codeset.CreditQualityCode.ExtremelySpeculative,
						com.tools20022.repository.codeset.CreditQualityCode.HighGrade, com.tools20022.repository.codeset.CreditQualityCode.HighlySpeculative, com.tools20022.repository.codeset.CreditQualityCode.InDefault,
						com.tools20022.repository.codeset.CreditQualityCode.LowerMediumGrade, com.tools20022.repository.codeset.CreditQualityCode.NonInvestmentGradeSpeculative, com.tools20022.repository.codeset.CreditQualityCode.Prime,
						com.tools20022.repository.codeset.CreditQualityCode.SubstantialRisk, com.tools20022.repository.codeset.CreditQualityCode.UpperMediumGrade);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DefaultImminent.getCodeName().get(), DefaultImminent);
		codesByName.put(ExtremelySpeculative.getCodeName().get(), ExtremelySpeculative);
		codesByName.put(HighGrade.getCodeName().get(), HighGrade);
		codesByName.put(HighlySpeculative.getCodeName().get(), HighlySpeculative);
		codesByName.put(InDefault.getCodeName().get(), InDefault);
		codesByName.put(LowerMediumGrade.getCodeName().get(), LowerMediumGrade);
		codesByName.put(NonInvestmentGradeSpeculative.getCodeName().get(), NonInvestmentGradeSpeculative);
		codesByName.put(Prime.getCodeName().get(), Prime);
		codesByName.put(SubstantialRisk.getCodeName().get(), SubstantialRisk);
		codesByName.put(UpperMediumGrade.getCodeName().get(), UpperMediumGrade);
	}

	public static CreditQualityCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CreditQualityCode[] values() {
		CreditQualityCode[] values = new CreditQualityCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CreditQualityCode> {
		@Override
		public CreditQualityCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CreditQualityCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}