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
import com.tools20022.repository.codeset.GeographicalEnvironmentCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the geographic environment, or zone, in which a payment is
 * executed, from the perspective of the forwarding or first agent, eg,
 * international.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GeographicalEnvironmentCode#Domestic
 * GeographicalEnvironmentCode.mmDomestic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GeographicalEnvironmentCode#EuroDomestic
 * GeographicalEnvironmentCode.mmEuroDomestic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GeographicalEnvironmentCode#FrenchDomTom
 * GeographicalEnvironmentCode.mmFrenchDomTom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GeographicalEnvironmentCode#International
 * GeographicalEnvironmentCode.mmInternational}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GeographicalEnvironmentCode#NAFTA
 * GeographicalEnvironmentCode.mmNAFTA}</li>
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
 * "GeographicalEnvironmentCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the geographic environment, or zone, in which a payment is executed, from the perspective of the forwarding or first agent, eg, international."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class GeographicalEnvironmentCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Transaction has an origin and a destination in the same country and is
	 * made in the currency of that country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeographicalEnvironmentCode
	 * GeographicalEnvironmentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DMST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Domestic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction has an origin and a destination in the same country and is made in the currency of that country."
	 * </li>
	 * </ul>
	 */
	public static final GeographicalEnvironmentCode Domestic = new GeographicalEnvironmentCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Domestic";
			definition = "Transaction has an origin and a destination in the same country and is made in the currency of that country.";
			owner_lazy = () -> com.tools20022.repository.codeset.GeographicalEnvironmentCode.mmObject();
			codeName = "DMST";
		}
	};
	/**
	 * Transaction is a credit transfer in Euro with its country of origin and
	 * country of destination within the European Union. Origin and destination
	 * countries may be one and the same country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeographicalEnvironmentCode
	 * GeographicalEnvironmentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EUDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EuroDomestic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a credit transfer in Euro with its country of origin and country of destination within the European Union. Origin and destination countries may be one and the same country."
	 * </li>
	 * </ul>
	 */
	public static final GeographicalEnvironmentCode EuroDomestic = new GeographicalEnvironmentCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EuroDomestic";
			definition = "Transaction is a credit transfer in Euro with its country of origin and country of destination within the European Union. Origin and destination countries may be one and the same country.";
			owner_lazy = () -> com.tools20022.repository.codeset.GeographicalEnvironmentCode.mmObject();
			codeName = "EUDM";
		}
	};
	/**
	 * Transaction is between a French Overseas Departments and Territories
	 * (Dom/Tom) and some country in the European Union (France included).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeographicalEnvironmentCode
	 * GeographicalEnvironmentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrenchDomTom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is between a French Overseas Departments and Territories (Dom/Tom) and some country in the European Union (France included)."
	 * </li>
	 * </ul>
	 */
	public static final GeographicalEnvironmentCode FrenchDomTom = new GeographicalEnvironmentCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrenchDomTom";
			definition = "Transaction is between a French Overseas Departments and Territories (Dom/Tom) and some country in the European Union (France included).";
			owner_lazy = () -> com.tools20022.repository.codeset.GeographicalEnvironmentCode.mmObject();
			codeName = "FRDT";
		}
	};
	/**
	 * Transaction has an origin in one country and a destination in another and
	 * is made in the currency of either the origin or destination country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeographicalEnvironmentCode
	 * GeographicalEnvironmentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "International"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction has an origin in one country and a destination in another and is made in the currency of either the origin or destination country."
	 * </li>
	 * </ul>
	 */
	public static final GeographicalEnvironmentCode International = new GeographicalEnvironmentCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "International";
			definition = "Transaction has an origin in one country and a destination in another and is made in the currency of either the origin or destination country.";
			owner_lazy = () -> com.tools20022.repository.codeset.GeographicalEnvironmentCode.mmObject();
			codeName = "INTL";
		}
	};
	/**
	 * Transaction is a North American Free Trade Association (NAFTA)
	 * transaction, ie, the first and final agent are both located in the NAFTA
	 * area.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GeographicalEnvironmentCode
	 * GeographicalEnvironmentCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NFTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NAFTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a North American Free Trade Association (NAFTA) transaction, ie, the first and final agent are both located in the NAFTA area."
	 * </li>
	 * </ul>
	 */
	public static final GeographicalEnvironmentCode NAFTA = new GeographicalEnvironmentCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NAFTA";
			definition = "Transaction is a North American Free Trade Association (NAFTA) transaction, ie, the first and final agent are both located in the NAFTA area.";
			owner_lazy = () -> com.tools20022.repository.codeset.GeographicalEnvironmentCode.mmObject();
			codeName = "NFTA";
		}
	};
	final static private LinkedHashMap<String, GeographicalEnvironmentCode> codesByName = new LinkedHashMap<>();

	protected GeographicalEnvironmentCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GeographicalEnvironmentCode";
				definition = "Specifies the geographic environment, or zone, in which a payment is executed, from the perspective of the forwarding or first agent, eg, international.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GeographicalEnvironmentCode.Domestic, com.tools20022.repository.codeset.GeographicalEnvironmentCode.EuroDomestic,
						com.tools20022.repository.codeset.GeographicalEnvironmentCode.FrenchDomTom, com.tools20022.repository.codeset.GeographicalEnvironmentCode.International,
						com.tools20022.repository.codeset.GeographicalEnvironmentCode.NAFTA);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Domestic.getCodeName().get(), Domestic);
		codesByName.put(EuroDomestic.getCodeName().get(), EuroDomestic);
		codesByName.put(FrenchDomTom.getCodeName().get(), FrenchDomTom);
		codesByName.put(International.getCodeName().get(), International);
		codesByName.put(NAFTA.getCodeName().get(), NAFTA);
	}

	public static GeographicalEnvironmentCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static GeographicalEnvironmentCode[] values() {
		GeographicalEnvironmentCode[] values = new GeographicalEnvironmentCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, GeographicalEnvironmentCode> {
		@Override
		public GeographicalEnvironmentCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(GeographicalEnvironmentCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}