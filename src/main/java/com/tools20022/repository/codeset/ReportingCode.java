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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ReportingCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies to which institution the reporting must be done.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingCode#StockExchange
 * ReportingCode.StockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingCode#RegulatoryOrganisation
 * ReportingCode.RegulatoryOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingCode#DeferredReport
 * ReportingCode.DeferredReport}</li>
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
 * <li>"STEX"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReportingCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies to which institution the reporting must be done."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReportingCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trade details are to be reported to a stock exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingCode
	 * ReportingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22a::RPOR//EXCH</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade details are to be reported to a stock exchange."</li>
	 * </ul>
	 */
	public static final ReportingCode StockExchange = new ReportingCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::RPOR//EXCH"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StockExchange";
			definition = "Trade details are to be reported to a stock exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingCode.mmObject();
			codeName = "STEX";
		}
	};
	/**
	 * Trade details are to be reported to a regulatory organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingCode
	 * ReportingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22a::RPOR//TRRE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryOrganisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade details are to be reported to a regulatory organisation."</li>
	 * </ul>
	 */
	public static final ReportingCode RegulatoryOrganisation = new ReportingCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::RPOR//TRRE"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegulatoryOrganisation";
			definition = "Trade details are to be reported to a regulatory organisation.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingCode.mmObject();
			codeName = "REGU";
		}
	};
	/**
	 * Report is deferred, for example, because the order was executed in
	 * partial fills.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingCode
	 * ReportingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeferredReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Report is deferred, for example, because the order was executed in partial fills."
	 * </li>
	 * </ul>
	 */
	public static final ReportingCode DeferredReport = new ReportingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeferredReport";
			definition = "Report is deferred, for example, because the order was executed in partial fills.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingCode.mmObject();
			codeName = "DEFR";
		}
	};
	final static private LinkedHashMap<String, ReportingCode> codesByName = new LinkedHashMap<>();

	protected ReportingCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("STEX");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportingCode";
				definition = "Identifies to which institution the reporting must be done.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReportingCode.StockExchange, com.tools20022.repository.codeset.ReportingCode.RegulatoryOrganisation,
						com.tools20022.repository.codeset.ReportingCode.DeferredReport);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(StockExchange.getCodeName().get(), StockExchange);
		codesByName.put(RegulatoryOrganisation.getCodeName().get(), RegulatoryOrganisation);
		codesByName.put(DeferredReport.getCodeName().get(), DeferredReport);
	}

	public static ReportingCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReportingCode[] values() {
		ReportingCode[] values = new ReportingCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReportingCode> {
		@Override
		public ReportingCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReportingCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}